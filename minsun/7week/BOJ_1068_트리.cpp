#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> v(50);
int ret = 0;
int n;
int removeNode =  0;
int root = 0;

void dfs(int n){
	if(n == removeNode){
		return;	
	} 
	if(v[n].size() == 0 || (v[n].size() == 1 && v[n][0] == removeNode)){
		ret++;
		return;
	}
	for(int i:v[n]){
		dfs(i);
	}
}

int main(){
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> n;
	int tmp;
	for(int i = 0; i < n; i++){
		cin >> tmp;
		if(tmp == -1){
			root = i;
			continue;
		}
		v[tmp].push_back(i);
	}
	
	cin >> removeNode;
	
	dfs(root);
	
	cout << ret;
}

