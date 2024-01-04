#include<bits/stdc++.h>
using namespace std;

string kanSet(int n){
	if(n == 1) return "-";
	if(n == 3) return "- -";
	else {
		string space;
		space.resize(n/3,' ');
		return kanSet(n/3) + space + kanSet(n/3);
	}
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n;
	while(cin >> n){
		cout << kanSet(pow(3,n)) << "\n";
	}
}
