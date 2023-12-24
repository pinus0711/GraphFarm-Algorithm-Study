#include<bits/stdc++.h>
using namespace std;

vector<pair<long, long>> vec;
int n;

bool cmp(pair<long, long> a, pair<long, long> b){
	if (a.second == b.second) return a.first < b.first;
	return a.second < b.second;
}
int main(){
	cin >> n;
	long n1, n2;
	for(int i = 0; i < n; i++){
		cin >> n1 >> n2;
		vec.push_back(make_pair(n1,n2));
	}
	sort(vec.begin(),vec.end(),cmp);
	int cnt = 0;
	int end = 0;
	for(auto v:vec){
		if(end > v.first) {
			continue;
		}
		end = v.second;
		cnt++;
	}
	cout << cnt;
}
