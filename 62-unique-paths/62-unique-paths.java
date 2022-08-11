class Solution {
    public int counts(int i,int j,int m,int n,int[][] dp) {
        if(i>m-1 || j>n-1)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(dp[i][j]!=0)
            return dp[i][j];
        else
            return dp[i][j]=counts(i+1,j,m,n,dp)+counts(i,j+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return counts(0,0,m,n,dp);
    }
}