#include<bits/stdc++.h>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";
    unordered_map<string,int> ch;
    
    for(string s:completion){
        ch[s] += 1;
    }
    
    for(string s:participant){
        ch[s] -= 1;
        if(ch[s] < 0) answer = s;
    }
    
    return answer;
}
