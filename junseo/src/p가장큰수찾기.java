class Solution {
    public int[] solution(int[] array) {
        // int[] answer = {};
        int length = array.length;
        int mx = -1;
        int mxIdx = 0;
        for(int i = 0; i<length; i++){
            int current = array[i];
            if(current > mx){
                mx = current;
                mxIdx = i;
            }
        }
        int[] answer = {mx,mxIdx};
        return answer;
    }
}
