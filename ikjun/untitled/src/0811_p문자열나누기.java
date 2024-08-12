class Solution {
    public int solution(String s) {
        int answer = 0;

        int beginstrstack =0;
        int diffstrstack=0;
        //다른 문자임을 담아내는 count 같은 문자임을 담아내는 count
        //문자열을 자르고 몇번 잘랏는지 나타내는 count
        char character ;

        character = s.charAt(0);
        for (int i =0; i< s.length(); i++){
            if (character == '0'){
                character = s.charAt(i);
            }
            if (character !=  s.charAt(i)){
                diffstrstack++;
            } else {
                beginstrstack++;
            }

            if (beginstrstack == diffstrstack ){
                answer++;
                beginstrstack = 0;
                diffstrstack  = 0;
                character = '0';
            }
            if (i == s.length()-1 && beginstrstack != diffstrstack){
                answer++;
                break;
            }

        }

        return answer;
    }
}