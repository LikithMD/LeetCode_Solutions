class Solution {
    public void rotate(int[][] matrix) {
        int l=0;
        int r=matrix.length-1;
        while(l<r) {
            for(int i=0;i<r-l;i++) {
                int t=l;
                int b=r;
                int temp=matrix[t][l+i];
                matrix[t][l+i]=matrix[b-i][l];
                matrix[b-i][l]=matrix[b][r-i];
                matrix[b][r-i]=matrix[t+i][r];
                matrix[t+i][r]=temp;
            }
            r-=1;
            l+=1;
        }
    }
}