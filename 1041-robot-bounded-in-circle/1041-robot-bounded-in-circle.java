class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0,dir=0;
        for(int i=0;i<instructions.length();i++) {
            if(instructions.charAt(i)=='R') {
                dir=(dir+1)%4;
            }
            else if(instructions.charAt(i)=='L') {
                dir=(dir+3)%4;
            }
            else {
                if(dir==0)
                    y++;
                else if(dir==1) 
                    x++;
                else if(dir==2)
                    y--;
                else 
                    x--;
            }
        }
        return (x==0 && y==0) || dir!=0;
    }
}