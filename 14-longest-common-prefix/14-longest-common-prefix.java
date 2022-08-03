class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        int n=strs.length;
        int l=strs[0].length();
        for(int i=0;i<l;i++) {
            char ch=strs[0].charAt(i);
            for(int j=0;j<n;j++) {
                if(strs[j].length()<=i || ch!=strs[j].charAt(i)) {
                    return s.toString();
                }
            }
            s.append(ch);
        }
        return s.toString();
    }
}