#include<bits/stdc++.h>
using namespace std;

int n;
int cnt = 0;
long long num = 665;

bool checkNum(string str){
	if (str.find("666") != string::npos) {
       return true;
    } else {
        return false;
    }
}
int main(){
	cin >> n;
	while(1){
		if(cnt == n) break;
		if(checkNum(to_string(++num))) cnt++;	
	}
	cout << num;
}
