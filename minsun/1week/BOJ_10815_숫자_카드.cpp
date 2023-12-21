#include<bits/stdc++.h>
using namespace std;

int n, m;
unordered_map<int, int> mp;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> m;
	int t;
	for(int i = 0; i < m; i++){
		cin >> t; 
		mp[t] = 1;	
	}
	
	cin >> n;
	for(int i = 0; i < n; i++){
		cin >> t;
		if(mp[t]){
			cout << 1 << " ";
		}else{
			cout << 0 << " ";
		}
	}
}
