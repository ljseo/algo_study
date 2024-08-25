import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String,Integer> genrePlayCnt = new HashMap<>();
        Map<String,List<Song>> genreSongs = new HashMap<>();
        
        int length = genres.length;
        
        for(int i = 0; i<length; i++){
            String genre = genres[i];
            int play = plays[i];
            genrePlayCnt.put(genre,genrePlayCnt.getOrDefault(genre,0) + play);
            List<Song> list = genreSongs.getOrDefault(genre,new ArrayList<>());
            list.add(new Song(i,play));
            genreSongs.put(genre,list);
            
        }
       
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> genrePlayCnt.get(b) - genrePlayCnt.get(a));
        pq.addAll(genrePlayCnt.keySet());
        List<Integer> bestAlbum = new ArrayList<>();
        
        while(!pq.isEmpty()){
            String genre = pq.poll();
            List<Song> list = genreSongs.get(genre);
            Collections.sort(list, (a,b) -> {
                if(a.plays == b.plays) return a.id - b.id;
                return b.plays - a.plays; 
            });
            bestAlbum.add(list.get(0).id);
            if(list.size()>1) bestAlbum.add(list.get(1).id);
        }
        
        return bestAlbum.stream().mapToInt(i -> i).toArray();
    }
    class Song{
        int id;
        int plays;
        Song(int id, int plays){
            this.id = id;
            this.plays = plays;
        }
        
    }
}
