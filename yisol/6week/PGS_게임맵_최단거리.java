import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    static class Point { // 포인트로 x,y좌표 저장
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int bfs(int[][] maps, int x, int y) {
        Queue<Point> que = new LinkedList<>();
        int width = maps.length;
        int height = maps[0].length;
        int[][] dist = new int[width][height];

        que.offer(new Point(x, y));
        dist[0][0]=1;
        while (!que.isEmpty()) {
            Point point = que.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx == width - 1 && ny == height - 1) {  //상대 진영 도착하면 거리 반환
                    return dist[point.x][point.y] + 1;
                }else if (nx >= 0 && nx < width && ny >= 0 && ny < height) {
                    if (maps[nx][ny] != 0) {
                        que.offer(new Point(nx, ny));
                        maps[nx][ny] = 0;  // 방문처리
                        dist[nx][ny] = dist[point.x][point.y] + 1;  //각 좌표당 이전 거리에+1해서 분기점 나눌 필요 없음
                    }
                }
            }
        }
        return -1;  //도달 못 하고 while문 빠져나오면 -1 리턴
    }

    public int solution(int[][] maps) {
        return bfs(maps, 0, 0);
    }
}
