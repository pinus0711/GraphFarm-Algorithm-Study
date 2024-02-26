#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> v(51,vector<int>(51,0));
int m, n;

int main(){
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	cin >> n >> m;
	string tmp;
	for(int i = 0; i < n; i++){
		cin >> tmp;
		int j = 0;
		for(char c:tmp){
			v[i][j] = c - '0';	
			j++;
		}
	}
	int maxx = 1;
	int maxL = 1;
	for(int i = 0; i < n; i++){
		for(int j = 0; j < m; j++){
			int minL = min(n-i, m-j);
			for(int k = 1; k < minL; k++){
				if(v[i][j] == v[i][j + k] && v[i][j] == v[i + k][j] && v[i][j] == v[i + k][j + k]){
					maxL = max(maxL, k + 1);
					maxx = max(maxx, (k + 1) * (k + 1));
				}
			}
		}
	}
	
	cout << maxx;
}
