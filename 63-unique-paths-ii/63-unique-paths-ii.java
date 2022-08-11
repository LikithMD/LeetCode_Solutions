class Solution {
    public int counts(int i,int j,int m,int n,int[][] arr,int[][] dp) {
        if(i>m-1 || j>n-1 || arr[i][j]!=0)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(dp[i][j]!=0)
            return dp[i][j];
        else
            return dp[i][j]=counts(i+1,j,m,n,arr,dp)+counts(i,j+1,m,n,arr,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        return counts(0,0,m,n,obstacleGrid,dp);
    }
}