import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 인용 횟수를 오름차순으로 정렬
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // 인덱스 i에서의 h 값
            if (citations[i] >= h) {
                return h; // h-Index 반환
            }
        }
        
        return 0; // 모든 논문이 h-Index 조건을 만족하지 않는 경우
    }
}
