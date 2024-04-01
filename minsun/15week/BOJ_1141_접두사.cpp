#include<bits/stdc++.h>
using namespace std;

map<char, vector<string>> mp;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;
	
	cin >> n;
	
	string s;
	
	for(int i = 0; i < n; i++){
		cin >> s;
		mp[s[0]].push_back(s);
	}
	int ret = 0;
	int cnt = 0;
	string checkedStr;
	for(int i = 'a'; i < 'z' + 1; i++){
		if(mp[(char)i].empty()) continue;
		if(mp[(char)i].size() == 1){
			ret++;
			continue;
		}
		cnt = mp[(char)i].size();
		sort(mp[(char)i].begin(),mp[(char)i].end());
		
		checkedStr = mp[(char)i][0];
		
		for(int idx = 1; idx < mp[(char)i].size(); idx++){
			if(mp[(char)i][idx].find(checkedStr) == 0){
				cnt--;
			}
			checkedStr = mp[(char)i][idx];
		}
		ret += cnt;
	}
	
	cout << ret;
}

/*
발전된 코드 

int main() {
	int n;
	cin >> n;

	vector<string> v;

	for (int i = 0; i < n; i++) {
		string s;
		cin >> s;
		v.push_back(s);
	}

	sort(v.begin(), v.end());

	string before = v[0];
	for (int i = 1; i < v.size(); i++) {
		if (v[i].find(before) == 0) {
			n--;
		}
		before = v[i];
	}
	cout << n << endl;
}


*/
