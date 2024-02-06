#include<bits/stdc++.h>

using namespace std;

int solution(vector<vector<string>> clothes) {
    int answer = 1;
    unordered_map<string,int> mp;
    for(vector<string> v:clothes){
        mp[v[1]]++;
    }
    auto iter = mp.begin();
    while(iter != mp.end()){
        answer = answer * (iter->second + 1);
        iter++;
    }
    
    return answer - 1;
}
