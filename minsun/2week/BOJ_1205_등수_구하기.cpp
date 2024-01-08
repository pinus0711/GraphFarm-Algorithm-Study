#include<bits/stdc++.h>
using namespace std;

int n, p;
vector<long> v;

bool compare(int i, int j){
	return i > j;
}
int main(){
	long score;
	cin >> n >> score >> p;
	
	long tmp;
	for(int i = 0; i < n; i++){
		cin >> tmp;
		v.push_back(tmp);
	}
	sort(v.begin(),v.end(),compare);
	int rank = 1;
	int i = 0;
	for(i; i < v.size(); i++){
		if(v[i] > score){
			rank++;
		}else if(v[i] < score){
			break;
		}
	}
	
	if(p == i) rank = -1;
	if(n == 0) rank = 1;
	
	cout << rank;
	return 0;
}

