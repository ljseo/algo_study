class Solution {
    public int solution(int m, int n, int[][] puddles) {

        int [][] dp =  new int [n+1][m+1];
        dp[1][1] = 1;
        for (int[] coordinate : puddles) {
            dp[coordinate[1]][coordinate[0]] = -1;
        }
        for (int i = 2; i <= m; i++) {
            if(dp[1][i] != -1 && dp[1][i-1] != -1) {
                dp[1][i] = dp[1][i-1];
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(dp[i][1] != -1 && dp[i-1][1] != -1){
                dp[i][1] = dp[i-1][1];
            }
            for (int j = 2; j <= m ; j++) {
                if(dp[i][j] != -1){
                    if(dp[i-1][j] != -1){
                        dp[i][j] += dp[i-1][j];
                    }
                    if(dp[i][j-1] != -1){
                        dp[i][j] += dp[i][j-1];
                    }
                    dp[i][j] %= 1000000007;
                }
            }
        }
        return dp[n][m];
    }
}
