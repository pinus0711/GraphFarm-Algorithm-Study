#include<bits/stdc++.h>
using namespace std;

int dx[4] = {0,1,0,-1};
int dy[4] = {-1,0,1,0};
int visited[100][100];

int solution(vector<vector<int> > maps)
{
    int answer = 0;
    queue<pair<int,int>> q;
    visited[0][0] = 1;
    q.push({0,0});
    int x, y, nx, ny;
    while(q.size()){
        tie(y,x) = q.front();
        q.pop();
        for(int i = 0; i < 4; i++){
            ny = y + dy[i];
            nx = x + dx[i];
            if(ny < 0 | ny >= maps.size() | nx < 0 | nx >= maps[0].size()) continue;
            if(maps[ny][nx] == 0) continue;
            if(visited[ny][nx]) continue;
            visited[ny][nx] = visited[y][x] + 1;
            q.push({ny,nx});
        }
    }
    answer = visited[maps.size() -1][maps[0].size() -1];
    if(answer == 0) return -1;
    return answer;
}
