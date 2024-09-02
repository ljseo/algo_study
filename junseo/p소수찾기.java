import java.util.*;
 class Solution {
    static int[] judgmentNumberArr;
    static int answer;
    static Set<Integer> candidate;
    static int[] cntNumbers;
    public int solution(String numbers) {

        judgmentNumberArr = new int[10000000];
        eratosthenes();
        answer = 0;
        candidate = new HashSet<>();
        cntNumbers = new int[11];
        for(char c : numbers.toCharArray()){
            int a = c - '0';
            cntNumbers[a]++;
        }
        for(int i = 1; i <= numbers.length(); i++){
            recul(0, numbers.toCharArray(), i, "");
        }

        for(Integer val : candidate){
            if(judgment(val)) {
                // System.out.println(val);
                answer++;
            }
        }

        return answer;
    }
    public void eratosthenes(){
        judgmentNumberArr[0] = 1;
        judgmentNumberArr[1] = 1;
        for(int i = 2; i < judgmentNumberArr.length; i++){
            if(judgmentNumberArr[i] == 0){
                for(int j = i*2; j < judgmentNumberArr.length; j+=i){
                    judgmentNumberArr[j] = 1;
                }
            }
        }
    }
    public boolean judgment(int val){
        if(judgmentNumberArr[val] == 0) return true;
        return false;
    }

    public void recul(int depth, char[] numbers, int targetDepth,String currentNumber){
        if(depth == targetDepth){
            candidate.add(Integer.valueOf(currentNumber));
        }
        for(char number : numbers){
            if(cntNumbers[number-'0'] > 0){
                cntNumbers[number-'0']--;
                recul(depth+1,numbers,targetDepth,currentNumber+number);
                cntNumbers[number-'0']++;
            }
        }
    }
}
