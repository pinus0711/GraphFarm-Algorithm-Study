#include<bits/stdc++.h>
using namespace std;

unordered_map<string,int> ump;
int n, m;
string s;

int main(){
	cin >> n >> m;
	for(int i = 0; i < n; i++){
		cin >> s;
		ump[s] = 1;
	}
	int cnt = 0;
	for(int i = 0; i < m; i++){
		cin >> s;
		cnt += ump[s];
	}
	cout << cnt;
}
