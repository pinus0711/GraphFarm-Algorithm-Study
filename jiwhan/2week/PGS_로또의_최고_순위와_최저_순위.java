// https://school.programmers.co.kr/learn/courses/30/lessons/77484#fn1

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int cnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                    break;
                }
            }

        }

        int[] result = { getHighest(cnt, zeroCnt), getLowest(cnt) };

        return result;
    }

    int getHighest(int cnt, int zeroCnt) {
        int highestValue = cnt + zeroCnt;

        switch (highestValue) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }

    int getLowest(int lowestValue) {

        switch (lowestValue) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}