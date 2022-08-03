class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0,dir=0;
        for(int i=0;i<moves.length();i++) {
            char ch=moves.charAt(i);
            switch(ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    dir=(dir+1)%4;
                    x++;
                    break;
                case 'L':
                    dir=(dir+3)%4;
                    x--;
                    break;
            }
        }
        return (x==0 && y==0 && dir==0);
    }
}