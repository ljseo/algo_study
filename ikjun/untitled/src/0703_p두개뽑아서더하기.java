import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList();
        int cnt = 0 ;

        for(int i=0; i <numbers.length; i++){
            for (int j = cnt+1; j < numbers.length; j++){
                if(!list.contains(numbers[i]+numbers[j]) ){
                    list.add(numbers[i]+numbers[j]);
                }
            }
            cnt ++;
        }
        int [] answer = new int[list.size()];
        for (int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return  answer;

    }
}