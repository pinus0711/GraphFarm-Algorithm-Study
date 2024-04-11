#include<bits/stdc++.h>

using namespace std;

int main(){
	vector<int> vec(1000001, 987654321);
	
	int n;
	cin >> n;
	
	vec[n] = 0; 
    
    for(int i = n; i > 1; i--){
        if(i % 3 == 0) vec[i/3] = min(vec[i] + 1, vec[i/3]);
        if(i % 2 == 0) vec[i/2] = min(vec[i] + 1, vec[i/2]);
        vec[i-1] = min(vec[i] + 1, vec[i-1]);
    }
    
    cout << vec[1];

	
}
