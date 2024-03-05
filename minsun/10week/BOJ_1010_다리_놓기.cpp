#include<bits/stdc++.h>
using namespace std;

long long combi(long long n, long long r) {
    long long res = 1;
    for (int i = 1; i <= r; ++i) {
        res *= n - r + i;
        res /= i;
    }
    return res;
}

int main(){
	long long t, n, m;
	cin >> t;
	for(int i = 0; i < t; i++){
		cin >> n >> m;
		cout << combi(m,n) << "\n";
	}
}
