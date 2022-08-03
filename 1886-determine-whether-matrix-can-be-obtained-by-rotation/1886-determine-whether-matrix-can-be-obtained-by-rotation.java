class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int j=0;j<4;j++) {
            if(Arrays.deepEquals(mat,target)) 
                return true;
            int l=0;
            int r=mat.length-1;
            while(l<r) {
                for(int i=0;i<r-l;i++) {
                    int t=l;
                    int b=r;
                    int temp=mat[t][l+i];
                    mat[t][l+i]=mat[b-i][l];
                    mat[b-i][l]=mat[b][r-i];
                    mat[b][r-i]=mat[t+i][r];
                    mat[t+i][r]=temp;
                }
                r-=1;
                l+=1;
            }
        }
        return false;
    }
}