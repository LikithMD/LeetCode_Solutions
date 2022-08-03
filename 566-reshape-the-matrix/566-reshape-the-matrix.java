class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c)
            return mat;
        int[][] arr=new int[r][c];
        int col=0,row=0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(col==mat[0].length) {
                    col=0;
                    row++;
                }
                arr[i][j]=mat[row][col];
                col++;
            }
        }
        return arr;
    }
}