class Solution {
    public int divide(int dividend, int divisor) {
        int quo=0;
        if(Integer.MIN_VALUE == dividend && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int x=Math.abs(dividend);
        int y=Math.abs(divisor);
        while((x-y)>=0) {
            int temp=y;
            int c=1;
            while(x-(temp<<1)>=0) {
                temp<<=1;
                c<<=1;
            }
            x-=temp;
            quo+=c;
        }
        return (dividend>0)==(divisor>0)?quo:-quo;
    }
}