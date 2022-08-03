class Solution {
    int len,maxlen;
    public void palindrome(String s,int l,int r) {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            l--;
            r++;
        }
        if(maxlen<r-l-1) {
            len=l+1;
            maxlen=r-l-1;
        }
    }
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;
        for(int i=0;i<s.length()-1;i++) {
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return s.substring(len,len+maxlen);
    }
}