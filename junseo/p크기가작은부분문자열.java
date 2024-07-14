import java.util.*;

class Solution {
    public int solution(String t, String p) {
        
        int pLength = p.length();        
        int tLength = t.length();        
        int answer = 0;
        for(int i = 0; i<=tLength - pLength; i++){
            String subStr = t.substring(i,i+pLength);
            
            if(subStr.compareTo(p) <= 0) {
                answer++;
            }
            
        }
        
        return answer;
    }
}
