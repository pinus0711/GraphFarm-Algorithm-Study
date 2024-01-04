#include<bits/stdc++.h>
using namespace std;

vector<int>vec(100001);
int M, N;
int tmp;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> N >> M;
	if(M > 200000) {
		cout << 0;
		return 0;
	}
	int result = 0;
	
	for(int i = 0; i < N; i++){
		cin >> tmp;
		vec[tmp]++;
		if(M-tmp > 0){
			if(vec[M-tmp] == 0) continue;
			if(tmp == M-tmp){
				if(vec[tmp] > 1){
					result += vec[tmp] / 2;
					vec[tmp] -= vec[tmp] / 2;
				}
			}
			else{
				if(vec[tmp] >= vec[M-tmp]){
					result += vec[M-tmp];
					vec[M-tmp] -= vec[M-tmp];
					vec[tmp] -= vec[M-tmp];
				}else if(vec[tmp] < vec[M-tmp]){
					result += vec[tmp];
					vec[M-tmp] -= vec[tmp];
					vec[tmp] -= vec[tmp];
				}
			}
		}
	}
	cout << result;
};
