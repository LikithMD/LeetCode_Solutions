class Solution {
    public boolean match(int[] matchsticks,int i,int top,int bot,int lef,int rig,int tar) {
        if(top==tar && bot==tar && lef==tar && rig==tar) 
            return true;
        if(top>tar || bot>tar || lef>tar || rig>tar)
            return false;
        int val=matchsticks[i];
        boolean t=match(matchsticks,i-1,top+val,bot,lef,rig,tar);
            if(t)
                return true;
        boolean b=match(matchsticks,i-1,top,bot+val,lef,rig,tar);
            if(b)
                return true;
        boolean l=match(matchsticks,i-1,top,bot,lef+val,rig,tar);
            if(l)
                return true;
        boolean r=match(matchsticks,i-1,top,bot,lef,rig+val,tar);
            if(r)
                return true;
        return false;
    }
    public boolean makesquare(int[] matchsticks) {
        int sum=Arrays.stream(matchsticks).sum();
        if(sum%4!=0)
            return false;
        Arrays.sort(matchsticks);
        return match(matchsticks,matchsticks.length-1,0,0,0,0,sum/4);
    }
}