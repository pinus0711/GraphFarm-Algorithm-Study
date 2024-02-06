#include<bits/stdc++.h>

using namespace std;

// string solu(string s1, string s2){
//     if(s1 + s2 > s2 + s1) return s1 + s2;
//     return s2 + s1;
// }

// string divide(vector<int> v){
//     if(v.size() == 1){
//         return to_string(v[0]);
//     }
//     string s1 = divide(vector<int>(v.begin(),v.begin() + v.size() / 2));
//     string s2 = divide(vector<int>(v.begin() + v.size() / 2, v.end()));
//     return solu(s1,s2);
// }

bool cmp(int a, int b){
    string s1 = to_string(a);
    string s2 = to_string(b);
    if(s1 + s2 > s2 + s1) return 1;
    return 0;
}

string solution(vector<int> numbers) {
    string answer = "";
    sort(numbers.begin(), numbers.end(), cmp);
    // answer = divide(numbers);
    for(int i:numbers){
        answer += to_string(i);
    }
    if(answer[0] == '0') answer = "0";
    return answer;
}
