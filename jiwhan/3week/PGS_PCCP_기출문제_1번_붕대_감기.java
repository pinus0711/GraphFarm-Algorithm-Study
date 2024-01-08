// https://school.programmers.co.kr/learn/courses/30/lessons/250137

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int straight = 0;
        int maxHealth = health;
        
        for (int i = 0; i < attacks[attacks.length - 1][0] + 1; i++) {
            boolean flag = true;

            for (int j = 0; j < attacks.length; j++) {
                if (i == attacks[j][0]) {
                    health -= attacks[j][1];
                    straight = 0;
                    flag = false;
                }
            }
            
            if (flag) {
                health += bandage[1];
                straight++;
            }
            
            if (straight == bandage[0]) {
                health += bandage[2];
                straight = 0;
            }
            
            if (health > maxHealth) health = maxHealth;
            
            System.out.println(health);
            
            if (health <= 0) return -1;
        }
        
        return health;
        
    }
}