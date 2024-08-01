import java.util.Comparator;
import java.util.PriorityQueue;

public class p교점에별만들기 {

    static class Solution {
        public static String[] solution(int[][] line) {


            /*
            Ax + By + E = 0
            Cx + Dy + F = 0
            이 때
            AD - BC = 0이면 두 직선은 평행 또는 일치

            x = (BF-ED)/(AD-BC)
            y = (EC-AF)/(AD-BC)
             */
            StringBuilder sb = new StringBuilder();
            PriorityQueue<long []> pq = new PriorityQueue<>(new Comparator<long[]>() {
                public int compare(long[] o1, long[] o2) {
                    if(o1[0] == o2[0]) return Long.compare(o1[1], o2[1]);
                    return Long.compare(o2[0], o1[0]);
                }
            });

            long mxCol = Long.MIN_VALUE;
            long mxRow = Long.MIN_VALUE;
            long mnCol = Long.MAX_VALUE;
            long mnRow = Long.MAX_VALUE;


            int len = line.length;
            for (int i = 0; i < len; i++) {
                int [] first = line[i];
                long A = first[0];
                long B = first[1];
                long E = first[2];
                for (int j = i + 1; j < len; j++) {
                    int[] second = line[j];
                    long C = second[0];
                    long D = second[1];
                    long F = second[2];
                    if(A*D - B*C !=0) {
                        double x = (double) (B * F - E * D) /(A*D-B*C);
                        double y = (double) (E * C - A * F) /(A*D-B*C);
                        if(x == Math.ceil(x) && y == Math.ceil(y)) {
                            long ix = (long) x;
                            long iy = (long) y;
                            mxCol = Math.max(iy, mxCol);
                            mxRow = Math.max(ix, mxRow);
                            mnCol = Math.min(iy, mnCol);
                            mnRow = Math.min(ix, mnRow);
                            pq.add(new long[]{iy, ix});
                        }
                    }
                }
            }

            for(long i = mxCol; i >= mnCol; i--) {
                for(long j = mnRow; j <= mxRow; j++) {
                    if(!pq.isEmpty() && pq.peek()[0] == i && pq.peek()[1] == j){
                        pq.poll();
                        sb.append("*");
                        while(!pq.isEmpty() && pq.peek()[0] == i && pq.peek()[1] == j){
                            pq.poll();
                        }
                    }
                    else{
                        sb.append(".");
                    }
                }
                sb.append("\n");
            }

            String[] answer = sb.toString().split("\n");
            return answer;
        }
    }

    public static void main(String[] args) {

        int[][] lines = 	{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        Solution s = new Solution();
        String[] solution = s.solution(lines);
        for (String line : solution) {
            System.out.println(line);
        }


    }
}
