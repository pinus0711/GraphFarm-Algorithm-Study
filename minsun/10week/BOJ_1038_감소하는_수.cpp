#include<bits/stdc++.h>
using namespace std;

int cnt = 0;
bool checked = false;
int n;

void dfs(int depth, int prevNum, string ret){
	if(checked) return;
	
	if(depth <= ret.size()){
		cnt++;
		if(cnt == n){
			cout << ret << "\n";
			checked = true;
		}
		return;
	}
	
	for(int i = 0; i < prevNum; i++){
		dfs(depth, i, ret + to_string(i));	
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	string checkedNum;
	cin >> n;
	if(n == 0){
		cout << 0;
		return 0;
	}
	for(int d = 1; d < 11; d++){
		for(int s = 1; s < 10; s++){
			if(checked) return 0;
			dfs(d, s, to_string(s));                                                                               
		}
	}
	if(!checked){
		cout << -1;
	}
}
