#include<bits/stdc++.h>
using namespace std;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;
	int ret;
	
	cin >> n;
	
	
	priority_queue<int, vector<int>, greater<int>> pq;
	
	int k;
	
	for(int i = 0; i < n; i ++){
		cin >> k;
		pq.push(k);		
	}
	
	int num1 = 0;
	int num2 = 0;
	
	while(pq.size() > 1){
		num1 = pq.top();
		pq.pop();
		num2 = pq.top();
		pq.pop();
		pq.push(num1 + num2);
		ret += num1 + num2;
	}
	
	cout << ret;
} 

