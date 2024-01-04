class Solution {
    public int solution(int num) {
        long l = (long)num;
        if(num == 1) return 0;
		int cnt = 0;
		int answer = -1;
		while(cnt<501) {
			if(l%2==0) {
				l /= 2;
			} else {
				l = l*3+1;
			}
			cnt++;
			if(l==1) {
				return cnt;
			}
			
		}
        return -1;
    }
}