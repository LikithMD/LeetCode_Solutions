class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        ArrayList<Character> str=new ArrayList<>();
        for(char c:s.toCharArray()) {
            if(Character.isAlphabetic(c) || Character.isDigit(c) && !Character.isWhitespace(c)) {
                str.add(c);
            }
        }
        
        int i,j;
        boolean flag=true;
        for(i=str.size()-1,j=0;i>=0&&j<str.size();i--,j++) {
            if(str.get(i)!=str.get(j)) {
                flag=false;
            }   
        }
        return flag;
    }
}