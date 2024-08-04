import java.io.*;
import java.util.*;

public class Main {
    static String[] minNumbers = new String[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 최소 수를 미리 계산
        precomputeMinNumbers();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 성냥개비 수
            sb.append(minNumbers[n]).append(" ").append(getMaxNumber(n)).append("\n");
        }
        
        System.out.println(sb);
    }

    private static void precomputeMinNumbers() {
        Arrays.fill(minNumbers, "");
        minNumbers[2] = "1";
        minNumbers[3] = "7";
        minNumbers[4] = "4";
        minNumbers[5] = "2";
        minNumbers[6] = "6";
        minNumbers[7] = "8";
        minNumbers[8] = "10";

        for (int i = 9; i <= 100; i++) {
            minNumbers[i] = minNumbers[i - 2] + "1";
            for (int j = 3; j <= 7; j++) {
                if (minNumbers[i - j] != "") {
                    String candidate = minNumbers[i - j] + getDigit(j);
                    if (isSmaller(candidate, minNumbers[i])) {
                        minNumbers[i] = candidate;
                    }
                }
            }
        }
    }

    private static String getDigit(int matches) {
        switch (matches) {
            case 2: return "1";
            case 3: return "7";
            case 4: return "4";
            case 5: return "2";
            case 6: return "0";
            case 7: return "8";
        }
        return "";
    }

    private static boolean isSmaller(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        return a.compareTo(b) < 0;
    }

    private static String getMaxNumber(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            sb.append("7");
            n -= 3;
        }
        while (n > 0) {
            sb.append("1");
            n -= 2;
        }
        return sb.toString();
    }
}
