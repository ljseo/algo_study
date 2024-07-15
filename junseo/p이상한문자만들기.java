import java.util.*;

class Solution {
    public String solution(String s) {
        
        char[] cArr = s.toCharArray();
        int length = cArr.length;
        int idx = 0;
        
        for(int i = 0; i<length; i++){
            if(cArr[i] == ' '){
                idx = 0;
                continue;
            }
            else{
                if(idx%2 == 0){
                    cArr[i] = Character.toUpperCase(cArr[i]);
                }
                else{
                    cArr[i] = Character.toLowerCase(cArr[i]);    
                }
                idx++;
            }
        }
        
        return new String(cArr);
    }
}
