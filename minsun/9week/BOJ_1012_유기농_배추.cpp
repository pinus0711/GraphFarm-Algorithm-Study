#include<bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int dx[] = {0, 0, 1, -1};
    int dy[] = {1, -1, 0, 0};

    int t;
    cin >> t;

    for (int idx = 0; idx < t; idx++) {
        int m, n, k;
        cin >> m >> n >> k;

        vector<vector<int>> arr(n, vector<int>(m, 0));
        vector<vector<bool>> visited(n, vector<bool>(m, false));

        for (int i = 0; i < k; i++) {
            int x, y;
            cin >> x >> y;
            arr[y][x] = 1;
        }

        int cnt = 0;

        for (int x1 = 0; x1 < m; x1++) {
            for (int y1 = 0; y1 < n; y1++) {
                if (visited[y1][x1] || arr[y1][x1] == 0) continue;

                cnt++;
                queue<pair<int, int>> q;
                q.push({y1, x1});
                visited[y1][x1] = true;

                while (!q.empty()) {
                    int y = q.front().first;
                    int x = q.front().second;
                    q.pop();

                    for (int i = 0; i < 4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                            if (!visited[ny][nx] && arr[ny][nx]) {
                                q.push({ny, nx});
                                visited[ny][nx] = true;
                            }
                        }
                    }
                }
            }
        }

        cout << cnt << "\n";
    }

    return 0;
}
