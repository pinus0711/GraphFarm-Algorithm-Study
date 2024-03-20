#include<bits/stdc++.h>
using namespace std;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int t;
	int x, y;
	
	vector<int> prices;
	vector<int> times;
	vector<int> arrs(20,0);
	
	
	cin >> t;
	
	for(int i = 0; i < t; i++){
		cin >> x >> y;
		times.push_back(x);
		prices.push_back(y);
	}
	
	
	for(int i = t - 1; i >= 0; i--){
		x = i + times[i];
		if(x > t){
			arrs[i] = arrs[i + 1];
		}else{
			arrs[i] = max(arrs[i + 1], arrs[x] + prices[i]);	
		}
	}
	
	cout << arrs[0];
	
}
