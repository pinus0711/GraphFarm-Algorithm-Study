#include<bits/stdc++.h>

using namespace std;

map<string, int> mp;

int main(){
	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	vector<string> vec(1001);
	
	int n;
	
	cin >> n;
	
	for(int i = 0; i < n; i++){
		cin >> vec[i];
	}
	
	int ret;
	int i = 1;
	int cnt = 0;
	
	while(1){
		for(int j = 0; j < n; j++){
			if(mp[vec[j].substr(vec[j].size()-i,i)]++ >= 1){
				break;
			}
			cnt = j;
		}
		
		if(cnt == n - 1){
			ret = i;
			break;
		}
        i++;
	}
	
	cout << ret;
	
}
