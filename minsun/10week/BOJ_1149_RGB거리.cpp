#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> vec(1001,vector<int>(3,1001));

int main() {
	int n;
	cin >> n;
	int r, g, b;
	cin >> r >> g >> b;
	vec[0][0] = r;
	vec[0][1] = g;
	vec[0][2] = b;
	
	for(int i = 1; i < n; i++){
		cin >> r >> g >> b;
		vec[i][0] = min(vec[i-1][1], vec[i-1][2]) + r;
		vec[i][1] = min(vec[i-1][0], vec[i-1][2]) + g;
		vec[i][2] = min(vec[i-1][0], vec[i-1][1]) + b;
	}
	
	cout << min(min(vec[n-1][0],vec[n-1][1]), vec[n-1][2]);
}
