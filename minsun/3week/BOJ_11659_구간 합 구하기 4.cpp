#include<bits/stdc++.h>
using namespace std;

int n, k;
vector<int> psum;

int main(){
	ios_base::sync_with_stdio(false);
	cout.tie(NULL);
	cin.tie(NULL);
	cin >> n >> k;
	int tmp;
	int sum;
	psum.push_back(0);
	for(int i = 0; i < n; i++){
		cin >> tmp;
		sum += tmp;
		psum.push_back(sum);
	}
	int si,ei;
	for(int i = 0; i < k; i++){
		cin >> si >> ei;
		cout << psum[ei] - psum[si-1] << "\n";
	}
}
