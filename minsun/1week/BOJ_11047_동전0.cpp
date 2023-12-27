#include<bits/stdc++.h>
using namespace std;

vector<int> v;
int n, k, cnt;

int main(){
	cin >> n >> k;
	
	int t;
	
	for(int i = 0; i < n; i++){
		cin >> t;
		v.insert(v.begin(), t);
	}
	
	for(int n:v){
		if(k == 0) break;
		cnt = cnt + k / n;
		k %= n;
	}
	cout << cnt;	
}
