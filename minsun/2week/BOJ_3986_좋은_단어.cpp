#include<bits/stdc++.h>
using namespace std;
bool check_good_word(string s){
	stack<char> stk;
	for(char c:s){
		if(stk.size() && stk.top() == c) {
			stk.pop();
		}else{
			stk.push(c);
		}
	}
	if(stk.size() == 0) return true;
	return false;
}

int n;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> n;
	int result = 0;
	for(int i = 0; i < n; i++){
		string str;
		cin >> str;
		if(check_good_word(str)) result++;
	}
	cout << result;
	return 0;
}	

