#include<bits/stdc++.h>
using namespace std;

int n;
vector<int> v;
vector<int> arr;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> n;

	int t;
	
	for(int i = 0; i <n; i++){
		cin >> t;
		arr.push_back(t);
	}
	
	for(int i = n; i > 0; i--){
		v.insert(v.begin() + arr[i-1], i);
	}
	
	for(int i = 0; i < n; i++){
		cout << v[i] << " ";
	}
}
