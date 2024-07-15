import java.util.*;

class Solution {
    
    static Stack<Integer> stack;
    
    public int solution(int n) {
        
        convert10to3(n);
        int answer = convert3to10(n);
        
        return answer;
    }
    
    public int convert3to10(int n){
        int size = stack.size();
        int ans = 0;
        int power = 1;
        for(int i = 0; i< size; i++){
            ans += stack.pop() * power;
            power *= 3;
        }
        return ans;
    }
    
    public void convert10to3(int n){
        stack = new Stack<>();
        while(n>=3){
            stack.push(n%3);
            n /= 3;
        }
        stack.push(n%3);
    }
                        
}
//String, parseInt 사용 
// import java.util.*;

// class Solution {
    
//     static String s = "";
    
//     public int solution(int n) {
        
//         convert10to3(n);
        
//         return Integer.parseInt(s,3);
//     }

//     public void convert10to3(int n){
//         while(n>0){
//             s += n%3+"";
//             n /= 3;
//         }
//     }                 
// }

