import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        List<Integer> answer = new ArrayList<>();
        int[] oneAnsArr = {1,2,3,4,5};
        int[] twoAnsArr = {2,1,2,3,2,4,2,5};
        int[] threeAnsArr = {3,3,1,1,2,2,4,4,5,5};
        int one = calAns(oneAnsArr,answers);
        int two = calAns(twoAnsArr,answers);
        int three = calAns(threeAnsArr,answers);
        
        int[] calResultArr = {one,two,three};
        Arrays.sort(calResultArr);
        
        if(one == calResultArr[2]) answer.add(1);
        if(two == calResultArr[2]) answer.add(2);
        if(three == calResultArr[2]) answer.add(3);
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    public int calAns(int[] arr, int[] answers){
        int length = arr.length;
        int idx = 0;
        int res = 0;
        for(int ans : answers){
            if(arr[idx%length] == ans) res++;
            idx++;
        }
        return res;
    }
}
