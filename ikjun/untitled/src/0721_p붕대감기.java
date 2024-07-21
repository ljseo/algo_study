class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int bandageTime = bandage[0];  // 붕대 감기 시전 시간
        int recoverySeconds = bandage[1];  // 1초당 회복량
        int finishAddRecovery = bandage[2];  // 추가 회복량

        int currentHealth = health;
        int consecutiveSeconds = 0;
        int attackIndex = 0;

        for (int second = 0; ; second++) {
            // 몬스터의 공격이 현재 시간에 있는지 확인
            if (attackIndex < attacks.length && attacks[attackIndex][0] == second) {
                int damage = attacks[attackIndex][1];
                currentHealth -= damage;

                if (currentHealth <= 0) {
                    return -1;
                }

                consecutiveSeconds = 0;  // 기술이 취소됨
                attackIndex++;
            } else {
                // 붕대 감기 기술 사용 중
                if (consecutiveSeconds < bandageTime) {
                    currentHealth += recoverySeconds;
                    if (currentHealth > maxHealth) {
                        currentHealth = maxHealth;
                    }
                    consecutiveSeconds++;
                }

                // 붕대 감기 기술 성공 후 추가 회복
                if (consecutiveSeconds == bandageTime) {
                    currentHealth += finishAddRecovery;
                    if (currentHealth > maxHealth) {
                        currentHealth = maxHealth;
                    }
                    consecutiveSeconds = 0;  // 기술이 끝나면 다시 초기화
                }
            }

            // 모든 공격이 끝난 경우
            if (attackIndex >= attacks.length) {
                break;
            }
        }

        return currentHealth;
    }

}