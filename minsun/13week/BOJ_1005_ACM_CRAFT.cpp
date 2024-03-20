#include<bits/stdc++.h>
using namespace std;

int main(){
	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n, k, t;
	
	int x, y;
	
	cin >> t;
	
	while(t--){
		
		vector<int> inDeg(1005,0);
		vector<int> adj[1005];
		vector<int> time(1005,0);
		vector<int> res(1005,0);
	
		cin >> n >> k;
		
		for(int i = 1; i < n+1; i++){
			cin >> time[i];
		}
		
		for(int i = 0; i < k; i++){
			cin >> x >> y;
			adj[x].push_back(y);
			inDeg[y]++;
		}
		
		int dest;
		
		cin >> dest;
		
		
		queue<int> q;
		
		for(int i = 1; i < n + 1; i++){
			if(inDeg[i] == 0){
				q.push(i);
			}
		}
		
		while(!q.empty()){
			int from = q.front();
			q.pop();
			
			for(int i = 0; i < adj[from].size(); i++){
				int to = adj[from][i];
				inDeg[to]--;
				res[to] = max(res[to], res[from] + time[from]);
				
				if(inDeg[to] == 0){
					q.push(to);
				}
			}
		}
		
		cout << res[dest] + time[dest] << "\n";
	}
	
}
