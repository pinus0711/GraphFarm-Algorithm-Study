#include<bits/stdc++.h>
using namespace std;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n, k;
	cin >> n >> k;
	int cnt = 0;
	int kCnt = 1;
	int idx = 1;
	vector<int> visited(n+1);
	cout <<"<";
	while(cnt < n){
		if(idx > n) idx = 1;
		if(visited[idx]) {
			idx++;
			continue;
		}
		if(kCnt == k){
			visited[idx] = 1;
			kCnt = 1;
			cout << idx;
			if(cnt < n - 1){
				cout << ", ";
			}else{
				cout << ">";
			}
			cnt++;
		}else{
			kCnt++;
		}
		idx++;
	}
}
