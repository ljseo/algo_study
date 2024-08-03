import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        
        for(char c : arr){
            if(c == '('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if(!stack.isEmpty())return false;
        else return true;
    }
}

