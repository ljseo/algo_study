import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int sco : scoville){
            pq.add((long)sco);
        }
        int cnt = 0;
        while(pq.peek()<K){
            if(pq.size()<2) return -1;
            Long first = pq.poll();
            Long second = pq.poll();
            Long nw = first + (second * 2);            
            pq.add(nw);
            cnt++;
        }
        return cnt;
    }
}
