import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String,Set<String>> map = new HashMap<>();
        for(String[] arr : clothes){
            String key = arr[1];
            String val = arr[0];
            
            if(map.containsKey(key)){
                map.get(key).add(val);
            }else{
                Set<String> set = new HashSet<>();
                set.add(val);
                map.put(key,set);
            }
        }
        int answer = 0;
        
        if(map.size() > 1){
            int cnt = 1;
            for(String key  : map.keySet()){
                Set<String> set = map.get(key);
                cnt *= set.size()+1;
            }
            answer += cnt-1;
        }
        else{
            answer += clothes.length;
        }
        
        return answer;
    }
}
