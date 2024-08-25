import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // HashSet을 이용해 모든 전화번호를 저장
        Set<String> set = new HashSet<>();
        for (String number : phone_book) {
            set.add(number);
        }

        // 각 전화번호에 대해 모든 접두어를 체크
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                // 접두어가 HashSet에 존재하는지 확인
                if (set.contains(number.substring(0, i))) {
                    return false;
                }
            }
        }

        // 접두어가 존재하지 않으면 true 반환
        return true;
    }
}
