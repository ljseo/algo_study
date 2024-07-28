import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int [] result = new int[photo.length];

        Map<String,Integer> map = new HashMap<>();


        for (int i=0; i < name.length; i ++ ){
            map.put(name[i],yearning[i]);
        }


        for (int i = 0; i< photo.length; i ++){
            for (int j = 0 ; j <photo[i].length; j++){
                if (map.containsKey(photo[i][j])){
                    photo[i][j] = String.valueOf(map.get(photo[i][j]));
                    result[i] += Integer.valueOf(photo[i][j]);
                }
            }
        }

        return result;
    }
}