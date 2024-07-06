
// v1
// 같은 알파벳이 있었는지 판단하기 위해 flag 변수 사용
class Solution {
    public int[] solution(String s) {
        // int[] answer = {};
        char[] cArray = s.toCharArray();
        int length = cArray.length;
        int[] answer = new int[length];
        answer[0] = -1;
        for(int i = 1; i<length; i++){
            char curA = cArray[i];
            int ans = 1;
            int flag = 0;
            for(int j = i-1; j>=0; j--){
                if(cArray[j] == curA){
                    flag = 1;
                    break;
                }else{
                    ans++;
                }
            }
            if(flag !=0){
                answer[i] = ans;
            }
            else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}

// v2
// Arrays.fill 메서드를 사용하여 배열을 -1로 채운 뒤 탐색 중 일치하는 경우에만 다른 값으로 초기화
// import java.util.*;

// class Solution {
//     public int[] solution(String s) {
//         char[] cArray = s.toCharArray();
//         int length = cArray.length;
//         int[] answer = new int[length];
//         Arrays.fill(answer,-1);
//         for(int i = 1; i<length; i++){
//             for(int j = i-1; j>=0; j--){
//                 if(cArray[j] == cArray[i]){
//                     answer[i] = i-j;
//                     break;
//                 }
//             }
//         }
//         return answer;
//     }
// }

// v3
// N^2의 시간복잡도를 줄이기 위해 HashMap을 사용
// HashMap에서 동일한 키에 대해 여러 번 put 메서드를 호출하면, 마지막에 호출된 put 메서드의 값이 해당 키에 대한 값으로 설정됨
// import java.util.*;
// class Solution {
//     public int[] solution(String s) {
        
//         char[] cArray = s.toCharArray();
//         int length = cArray.length;
//         int[] answer = new int[length];
//         Arrays.fill(answer,-1);
//         Map<Character,Integer> map = new HashMap<>();
//         for(int i = 0; i<length; i++){
//             Integer val = map.get(cArray[i]);
//             if(val != null){
//                 answer[i] = i - val;
//             }
//             map.put(cArray[i],i);
//         }
//         return answer;
//     }
// }
