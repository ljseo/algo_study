import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int rowPlusCol = 6 + (brown - 8) / 2;
        int rowStart = (int)Math.ceil(rowPlusCol/2.0);
        
        for(int row = rowStart; row <= rowPlusCol-3; row++){
            int col = rowPlusCol - row;
            int size = row * col;
            if(yellow == (size-brown)) return new int[] {row,col};
        }
        
        int[] answer = {};
        return answer;
    }
}
