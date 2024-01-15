#include<bits/stdc++.h>
using namespace std;

int n, k;
vector<int> psum;

int main(){
	cin >> n >> k;
	int tmp;
	int sum;
	for(int i = 0; i < n; i++){
		cin >> tmp;
		sum += tmp;
		psum.push_back(sum);
	}

	int summ = 0;
	int maxx = psum[k - 1];
	
	for(int i = 0; i < n - k; i++){
		summ = psum[i + k] - psum[i];
		if(summ > maxx){
			maxx = summ;
		}
	}
	cout << maxx;
}
