#include<bits/stdc++.h>
using namespace std;


char kx, bx;
int ky,by;
//			R, L , B, T, RT, LT, RB, LB
int dx[8] = {1, -1, 0, 0, 1, -1, 1, -1};
int dy[8] = {0, 0, -1, 1, 1, 1, -1, -1};

int main(){
	string ks, bs;
	int n;
	cin >> ks >> bs >> n;
	kx = ks[0];
	bx = bs[0];
	ky = ks[1] - '0';
	by = bs[1] - '0';
	
	
	string d;
	int idx;
	for(int i = 0; i < n; i++){
		cin >> d;
		if(d == "R"){
			idx = 0;
		}else if(d == "L"){
			idx = 1;
		}else if(d == "B"){
			idx = 2;
		}else if(d == "T"){
			idx = 3;
		}else if(d == "RT"){
			idx = 4;
		}else if(d == "LT"){
			idx = 5;
		}else if(d == "RB"){
			idx = 6;
		}else if(d == "LB"){
			idx = 7;
		}
		
		char nkx = (char)(kx + dx[idx]);
		int nky = ky + dy[idx];
		
		if(nkx > 'H' || nky > 8 || nkx < 'A' || nky < 1) continue;
		
		if(nkx == bx && nky == by){
			char nbx = (char)(bx + dx[idx]);
			int nby = by + dy[idx];
			if(nbx > 'H' || nby > 8 || nbx < 'A' || nby < 1) continue;
			bx = nbx;
			by = nby;
		}
		
		kx = nkx;
		ky = nky;
	}
	
	cout << kx + to_string(ky) << "\n";
	cout << bx + to_string(by) << "\n";
	
}
