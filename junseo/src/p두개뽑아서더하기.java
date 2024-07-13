import java.util.*;

class Solution {
   public int[] solution(int[] numbers) {
        Set<Integer> sums = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[sums.size()];
        int index = 0;
        for (int num : sums) {
            answer[index++] = num;
        }
        return answer;
      }
}
