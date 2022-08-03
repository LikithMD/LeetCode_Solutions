class Solution {
    public int countSubstrings(String s) {
        int res = 0, n = s.length();
    boolean[][] dp = new boolean[n][n];

    for (int i = n - 1; i >= 0; i--) {
        for (int j = i; j < n; j++) {
            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]);
            res += dp[i][j] ? 1 : 0;
        }
    }
    return res;
    }
}