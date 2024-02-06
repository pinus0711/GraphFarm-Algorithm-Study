#include<bits/stdc++.h>

using namespace std;
bool cmp(pair<string, int> a, pair<string, int> b){
    return a.second > b.second;
}
vector<int> solution(vector<string> genres, vector<int> plays) {
    vector<int> answer;
    unordered_map<string,int> gCnt;
    unordered_map<string,vector<pair<int,int>>> gTop;
    for(int i =0; i < plays.size(); i++){
        gCnt[genres[i]] += plays[i];
        if(gTop[genres[i]].size() == 0) gTop[genres[i]].push_back({i, plays[i]});
        else if(gTop[genres[i]].size() == 1) {
            if(gTop[genres[i]][0].second < plays[i]) gTop[genres[i]].insert(gTop[genres[i]].begin(),{i, plays[i]});
            else gTop[genres[i]].push_back({i, plays[i]});
        }
        else{
            if(gTop[genres[i]][0].second < plays[i]) {
                gTop[genres[i]][1] = gTop[genres[i]][0];
                gTop[genres[i]][0] = make_pair(i,plays[i]);                                  
            }
            else if(gTop[genres[i]][1].second < plays[i]){ 
                gTop[genres[i]][1] = make_pair(i,plays[i]); 
            }
        }
    }
    
    vector<pair<string, int>> sortNum(gCnt.begin(),gCnt.end());
    sort(sortNum.begin(),sortNum.end(),cmp);
    
    for(pair<string, int> p:sortNum){
        for(auto a:gTop[p.first]){
            answer.push_back(a.first);
        }
    }
    return answer;
}
