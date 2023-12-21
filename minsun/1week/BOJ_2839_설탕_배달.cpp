#include<bits/stdc++.h>
using namespace std;

int n;
int main(){
	cin >> n;
	int bCnt = n / 5;
	int sCnt = 0;
	int rest = n % 5;
	
	while(1){
		if(bCnt < 0) {
			cout << -1;
			break;
		}
		if(rest % 3 == 0) {
			sCnt = rest / 3;
			cout << bCnt + sCnt;
			break;
		}
		
		bCnt--;
		rest += 5;
	}
	
	return 0;
}
