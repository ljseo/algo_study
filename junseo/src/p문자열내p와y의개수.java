
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        Map<Character,Integer> map = new HashMap<>();
        map.put('p',0);
        map.put('y',0);
        
        char[] cArr = s.toCharArray();
        int length = cArr.length;
        
        for(int i = 0; i < length; i++){
            if(cArr[i] == 'p' || cArr[i] == 'P'){
                Integer val = map.get('p');
                map.put('p',++val);
            }
            if(cArr[i] == 'y' || cArr[i] == 'Y'){
                Integer val = map.get('y');
                map.put('y',++val);
            }
        }
        int yVal = map.get('y');
        int pVal = map.get('p');
    
        return yVal == pVal;
        
    }
}
