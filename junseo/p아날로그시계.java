class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        
        /*
        1. 단위 통합
        - 1시간 = 60분, 1분 = 60초 
        - 1시간 = 3600 초
        
        2. 시작시간부터 끝나는 시간까지 1초식 더함 
        - 이 때 시작시간에서 초침이 시침 또는 분침과 겹쳐있는지 확인 
        - 시작시간이 0시0분0초 혹은 12시 0분 0초 일 때 초침이 시침과 분침과 겹침 
        - 0시 5분 0초 일 때는 시침이 0에서 1쪽으로 조금 기울어져 있기 때문에 겹쳐있다고 판단하지 않음
        - startSecond == 0 || startSecond == 43200 일 때 answer++; 하고 시작 
        
        3. 1초 마다 시침, 분침 그리고 초침이 기우는 각도를 계산해야함 
        - 시침 : 360도를 도는데 43200초가 필요함 360/43200 
        - 분침 : 360도를 도는데 3600초가 필요함 360/3600
        - 초침 : 360도를 도는데 60초가 필요함 360/60 
        
        4. 현재 시간에서 시침, 분침, 초침의 기울어진 각도를 계산 
        - 현재시간에서 43200을 나눈 나머지에서 360/43200 을 곱함 -> 현재 시침 기울어진 기울기
        - 현재시간에서 3600을 나눈 나머지에서 360/3600 을 곱함 -> 현재 분침이 기울어진 기울기
        - 현재시간에서 60을 나눈 나머지에서 360/60을 곱함 -> 현재 초침이 기울어진 기울기 
        
        5. 현재 시간에서 1초전의 시침, 분침, 초침의 기울기가 있을 때,
        1초전의 초침이 시침, 분침보다 작았고, 현재 초침의 기울기가 시침, 분침보다 커졌으면 answer++
        
        */
        int answer = 0;
        int startSecond = h1*3600 + m1*60 + s1;
        int endSecond = h2*3600 + m2*60 + s2;

        double hourAnglePerSecond = (double)360/43200;
        double minuteAnglePerSecond = (double)360/3600;
        double secondAnglePerSecond = (double)360/60;

        if(startSecond == 0 || startSecond == 43200) answer++;

        for(int i = startSecond+1; i<=endSecond; i++){
            int flag = 0;
            double pastHourAngle = ((i-1) * hourAnglePerSecond) % 360.0;
            double pastMinuteAngle = ((i-1) * minuteAnglePerSecond) % 360.0;
            double pastSecondAngle = ((i-1) * secondAnglePerSecond) % 360.0;

            double currentHourAngle = (i * hourAnglePerSecond) % 360.0;
            double currentMinuteAngle = (i * minuteAnglePerSecond) % 360.0;
            double currentSecondAngle = (i * secondAnglePerSecond) % 360.0;

            if(currentHourAngle == 0) currentHourAngle = 360;
            if(currentMinuteAngle == 0) currentMinuteAngle = 360;
            if(currentSecondAngle == 0) currentSecondAngle = 360;

            if((pastSecondAngle < pastHourAngle) && (currentSecondAngle>=currentHourAngle)){
                answer++;
            }
            if((pastSecondAngle < pastMinuteAngle) && (currentSecondAngle>=currentMinuteAngle)){
                answer++;
            }
            if(currentHourAngle == currentMinuteAngle) answer--;
        }

        return answer;
    }
}
