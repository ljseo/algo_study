class Solution {
    public int solution(String s) {
        int answer = 0;

        String [] NumberArray = {"zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"    };


        for (int i = 0 ; i < NumberArray.length; i++){
            if (s.contains(NumberArray[i])){
                s =s.replace(NumberArray[i],String.valueOf(i));
            }
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}