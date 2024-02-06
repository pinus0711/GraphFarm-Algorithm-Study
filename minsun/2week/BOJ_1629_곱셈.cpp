#include<bits/stdc++.h>
using namespace std;

long long a, b, c;


unsigned long long poww(long long a, long long b){
	if(b==0) return 1;
	if(b==1) return a % c;
	long long ret = poww(a,b/2);
	if(b % 2){
		ret = ((ret * ret) % c)*a % c;
	}else{
		ret = (ret * ret) % c;
	}
	return ret;
}


int main(){
	cin >> a >> b >> c;
	
	long long result = a % c;
	
	cout << poww(a,b);
}
