#include<bits/stdc++.h>
using namespace std;

vector<int> vec;
unordered_map<int,int> ump;
int n;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	cin >> n;
	int k;
	for(int i = 0; i < n; i++){
		cin >> k;
		vec.push_back(k);
	}
	vector<int> ori_vec = vec;
	sort(vec.begin(), vec.end());
	vec.erase(unique(vec.begin(), vec.end()),vec.end());
	int cnt = 0;
	for(int i:vec){
		ump[i] = cnt;
		cnt++;
	}
	for(int i:ori_vec){
		cout << ump[i] << " ";
	}
	
	return 0;
}
