// import java.util.*;

// class Solution {
//     public int solution(int[] nums) {
        
//         int length = nums.length;
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int kind : nums){
//             Integer val = map.get(kind);
//             if(val == null){
//                 map.put(kind,1);
//             }
//             else{
//                 map.put(kind,val++);
//             }
//         }
//         int answer = 0;
//         if(map.size()>=length/2){
//             answer = length/2;
//         }
//         else{
//             answer = map.size();
//         }
//         return answer;
//     }
// }
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // HashSet을 사용하여 중복된 폰켓몬 종류를 제거
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 선택할 수 있는 최대 폰켓몬 수는 N/2
        int maxSelect = nums.length / 2;

        // 중복을 제거한 폰켓몬 종류의 수와 maxSelect 중 작은 값을 반환
        return Math.min(set.size(), maxSelect);
    }
}
