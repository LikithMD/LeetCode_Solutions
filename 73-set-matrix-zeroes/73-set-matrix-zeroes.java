class Solution {
    public void setZeroes(int[][] matrix) {
        int k=0;
        while (k < matrix[0].length && matrix[0][k] != 0) 
            ++k;
        for(int i=1;i<matrix.length;++i) {
            for(int j=0;j<matrix[0].length;++j) {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;++i) {
            for(int j=matrix[0].length-1;j>=0;--j) {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        if (k < matrix[0].length) 
            Arrays.fill(matrix[0], 0);
    }
}