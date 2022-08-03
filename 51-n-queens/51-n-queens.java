class Solution {
    public void solve(int col,char[][] board,int[] left,int[] lower,int[] upper,List<List<String>> ds) {
        if(col==board.length) {
            ds.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++) {
            if(left[row]==0 && lower[row+col]==0 && upper[board.length-1+row-col]==0) {
                board[row][col]='Q';
                left[row]=1;
                lower[row+col]=1;
                upper[board.length-1+row-col]=1;
                solve(col+1,board,left,lower,upper,ds);
                board[row][col]='.';
                left[row]=0;
                lower[row+col]=0;
                upper[board.length-1+row-col]=0;
            }
        }
    }
    public List<String> construct(char[][] board) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++) {
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<List<String>>();
        int[] left=new int[n];
        int[] lower=new int[2*n-1];
        int[] upper=new int[2*n-1];        
        solve(0,board,left,lower,upper,ans);
        return ans;
    }
}