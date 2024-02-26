#include<bits/stdc++.h>
using namespace std;

vector<vector<pair<int,int>>> adj;

int solution(int from, int to){
	vector<int> visited(1001,0);
	queue<int> q;
	q.push(from);
	int curlFrom;
	while(!q.empty()){
		curlFrom = q.front();
		q.pop();
		if(curlFrom == to) break;
		for(auto a:adj[curlFrom]){
			if(!visited[a.first]){
				q.push(a.first);
				visited[a.first] = visited[curlFrom] + a.second;
			}
		}
	}
	
	return visited[to];
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n, m;
	
	cin >> n >> m;
	adj.resize(n+1);
	
	int a, b, c;
	
	for(int i = 0; i < n - 1; i++){
		cin >> a >> b >> c;
		adj[a].push_back({b,c});
		adj[b].push_back({a,c});
	}
	
	int from, to;
	
	for(int i = 0; i < m; i++){
		cin >> from >> to;
		cout << solution(from,to) << "\n";	
	}
}
