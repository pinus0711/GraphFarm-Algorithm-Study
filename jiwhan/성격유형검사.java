class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = {0, -3, -2, -1, 0, 1, 2, 3};
        int[] value = new int[4];
        
        for (int i = 0; i < survey.length; i++) {
            
            if (survey[i].contains("R")) {
                if (survey[i].indexOf("R") == 0) value[0] += score[choices[i]];
                else value[0] += score[reverseChoice(choices[i])];
            }
        
            if (survey[i].contains("C")) {
                if (survey[i].indexOf("C") == 0) value[1] += score[choices[i]];
                else value[1] += score[reverseChoice(choices[i])];
            }
            
            if (survey[i].contains("J")) {
                if (survey[i].indexOf("J") == 0) value[2] += score[choices[i]];
                else value[2] += score[reverseChoice(choices[i])];
            }
            
            if (survey[i].contains("A")) {
                if (survey[i].indexOf("A") == 0) value[3] += score[choices[i]];
                else value[3] += score[reverseChoice(choices[i])];
            }
            
        }
        
        answer = personality(value);
        
        return answer;
    }
    
    int reverseChoice(int choice) {
        if (choice == 4) return choice;
        
        if (choice == 1) choice = 7;
        else if (choice == 2) choice = 6;
        else if (choice == 3) choice = 5;
        else if (choice == 5) choice = 3;
        else if (choice == 6) choice = 2;
        else if (choice == 7) choice = 1;
        
        return choice;
    }
    
    String personality (int[] value) {
        String answer = "";
        
        if (value[0] <= 0) answer += "R";
        else answer += "T";
        
        if (value[1] <= 0) answer += "C";
        else answer += "F";
        
        if (value[2] <= 0) answer += "J";
        else answer += "M";
        
        if (value[3] <= 0) answer += "A";
        else answer += "N";
        
        return answer;
    }
}