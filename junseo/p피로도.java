import java.util.*;

class Solution {
    
    static int[][] sDungeons;
    static boolean[] vis;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        
        sDungeons = dungeons;
        vis = new boolean [dungeons.length];
        answer = 0;
        
        recur(0,k);
        
        return answer;
    }
    
    public void recur(int cnt, int fatigue){
        answer = Math.max(answer,cnt);
        
        for(int i = 0; i < sDungeons.length; i++){
            int minFatigue = sDungeons[i][0];
            int consumeFatigue = sDungeons[i][1];
            
            if(!vis[i] && fatigue >= minFatigue){
                vis[i] = true;
                recur(cnt+1,fatigue - consumeFatigue);
                vis[i] = false;
            }
        }
        
    }
}


