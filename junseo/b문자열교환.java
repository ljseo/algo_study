import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b문자열교환{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int len = arr.length;
        int aCnt = 0;
        for (int i = 0; i < len; i++) {
            if(arr[i] == 'a'){
                aCnt++;
            }
        }
        int bCnt = 0;
        for (int i = 0; i < aCnt; i++) {
            if(arr[i] == 'b'){
                bCnt++;
            }
        }
        int bMinCnt = bCnt;
        for (int i = 1; i < len; i++) {
            if(arr[(i - 1) % len] == 'b'){
                bCnt--;
            }
            if(arr[(i + aCnt -1) % len] == 'b'){
                bCnt++;
            }
            bMinCnt = Math.min(bMinCnt, bCnt);
        }
        System.out.println(bMinCnt);
    }
}

