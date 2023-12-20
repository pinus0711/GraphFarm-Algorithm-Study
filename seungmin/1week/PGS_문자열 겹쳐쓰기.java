class Solution { // Programmers에서는 요구하는 기능을 동작시키는 클래스만 작성하면 된다.
    public String solution(String my_string, String overwrite_string, int s) {

        String result = "";

        // 나의 풀이.
        // 바꿀 문자열 전의 부분
        for (int i=0; i<s; i++) { result += my_string.charAt(i); }

        // 바꿀 문자열 부분
        for (int i=0; i<overwrite_string.length(); i++) { result += overwrite_string.charAt(i); }

        // 바꿀 문자열 후의 부분
        for (int i=s+overwrite_string.length(); i<my_string.length(); i++) {
            result += my_string.charAt(i);
        }

        return result;

        // 다른 풀이. (Substring)
        // String before = my_string.substring(0, s);
        // String after = my_string.substring(s + overwrite_string.length());
        // return before + overwrite_string + after;
    }
}