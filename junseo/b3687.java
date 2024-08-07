import java.io.*;
import java.util.*;

public class Main {
    static int[] numRequire = {6,2,5,5,4,5,6,3,7,6};

    public static void main(String[] args) throws IOException {
        /*
        n에 해당하는 모든 값을 구해놓고 (메모이제이션) n에 따른 값만 출력 (최소값)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] minDp = new String[101];
        calMin(minDp);

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            sb.append(minDp[n]).append(" ");

            if(n%2 == 1){
                sb.append("7");
                n -= 3;
            }
            for (int i = n; i > 0 ; i -= 2) {
                sb.append("1");
            }
            System.out.println(sb);
        }
    }

    private static void calMin(String[] minDp) {
        minDp[2] = "1";
        minDp[3] = "7";
        minDp[4] = "4";
        minDp[5] = "2";
        minDp[6] = "6";
        minDp[7] = "8";

        for (int i = 8; i < 101; i++) {
            minDp[i] = minDp[i-2] + "1";
            for (int j = 3; j <= 7; j++) {
                String candidate = minDp[i - j] + getNumber(j);
                if (compareNumbers(candidate, minDp[i])) {
                    minDp[i] = candidate;
                }
            }
        }
    }
    private static boolean compareNumbers(String candidate, String current) {
        if (current == null) return true;
        if (candidate.length() != current.length()) {
            return candidate.length() < current.length();
        }
        return candidate.compareTo(current) < 0;
    }

    private static String getNumber(int j) {
        switch(j){
            case 3 : return "7";
            case 4 : return "4";
            case 5 : return "2";
            case 6 : return "0";
            case 7 : return "8";
            default: return "";
        }
    }
}
