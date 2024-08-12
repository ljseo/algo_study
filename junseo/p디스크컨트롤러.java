import java.util.*;

class Solution {
        public int solution(int[][] jobs) {

            PriorityQueue<Job> firstPq = new PriorityQueue<>(new Comparator<Job>() {
                @Override
                public int compare(Job o1, Job o2) {
                    if(o1.requestTime == o2.requestTime) return o1.requireTime - o2.requireTime;
                    return o1.requestTime - o2.requestTime;
                }
            });
            PriorityQueue<Job> secondPq = new PriorityQueue<>(new Comparator<Job>() {
                @Override
                public int compare(Job o1, Job o2) {
                    return o1.requireTime - o2.requireTime;
                }
            });

            for (int[] job : jobs) {
                firstPq.add(new Job(job[0],job[1]));
            }
            int currentTime = 0;
            int ans = 0;
            while (!firstPq.isEmpty()) {
                while(!firstPq.isEmpty() && firstPq.peek().requestTime <= currentTime){
                    secondPq.add(firstPq.poll());
                }
                if(secondPq.isEmpty()){
                    currentTime++;
                }
                else {
                    Job currentJob = secondPq.poll();
                    ans += currentTime - currentJob.requestTime;
                    ans += currentJob.requireTime;
                    currentTime += currentJob.requireTime;
                }
            }

            while(!secondPq.isEmpty()){
                Job currentJob = secondPq.poll();
                ans += currentTime - currentJob.requestTime;
                ans += currentJob.requireTime;
                currentTime += currentJob.requireTime;
            }

            int answer = ans / jobs.length;
            return answer;
        }
        class Job{
            int requestTime;
            int requireTime;

            public Job(int requestTime, int requireTime) {
                this.requestTime = requestTime;
                this.requireTime = requireTime;
            }
        }

}
