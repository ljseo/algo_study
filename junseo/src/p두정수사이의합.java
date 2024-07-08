// v1
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            return answer = a;
        }
        
        int mx,mn;
        if(a < b){
            mn = a;
            mx = b;
        }
        else{
            mn = b;
            mx = a;
        }
        for(int i = mn; i<=mx; i++){
            answer += i;
        }
        return answer;
    }
}

// v2
//Math.max, Math.min 사용 

// class Solution {
//     public long solution(int a, int b) {
//         long answer = 0;
//         if(a == b){
//             return answer = a;
//         }
        
//         int mx,mn;
//         mx = Math.max(a,b);
//         mn = Math.min(a,b);
//         for(int i = mn; i<=mx; i++){
//             answer += i;
//         }
//         return answer;
//     }
// }

// v3
// 가우스의 덧셈 공식 사용
// class Solution {
//     public long solution(int a, int b) {
//         long answer = 0;
//         if(a == b){
//             return answer = a;
//         }
        
//         long mx,mn;
//         mx = Math.max(a,b); 
//         mn = Math.min(a,b); 
        
//         answer = sol(mn,mx);
        
//         return answer;
//     }
//     public long sol(long mn, long mx){ 
//         return (mx - mn + 1) * (mx + mn) / 2;
//     }
// }
