class Solution {
    public int myAtoi(String s) {
        if(s==null || s.length()<1)
            return 0;
        final int max=2147483647;
        final int min=-2147483648;
        int i=0;
        s=s.replaceAll("^\\s+", "");
        boolean neg=s.startsWith("-");
        boolean pos=s.startsWith("+");
        if (neg || pos) {
            i++;
        }
        double num=0;
        while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
            num=num*10+(s.charAt(i)-'0');
            i++;
        }
        num=neg?-num:num;
        if (num<min) {
            return min;
        }
        if (num>max) {
            return max;
        }
        return (int)num;
    }
}