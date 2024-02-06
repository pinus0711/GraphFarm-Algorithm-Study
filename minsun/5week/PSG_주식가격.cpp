#include<bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> prices) {
    const int maxSize = prices.size();
    vector<int> answer(maxSize);
    stack<pair<int,int>> s;
    for(int i = 0; i < maxSize; i++){ 
        if(i == 0 || prices[i] >= s.top().first){
            s.push({prices[i],i});
            }
        else{
            while(s.size() > 0 && prices[i] < s.top().first){
                answer[s.top().second] = i - s.top().second;
                s.pop();   
            }
            s.push({prices[i],i});
        }
    }
    while(s.size() > 0){
        answer[s.top().second] = maxSize - s.top().second - 1;
        s.pop();
    }
    return answer;
}
