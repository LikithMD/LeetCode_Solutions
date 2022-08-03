class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characters=new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++) {
            characters[s.charAt(i)-'a']++;
            characters[t.charAt(i)-'a']--;
        }
        for(int x: characters)
            if(x!=0)
                return false;
        return true;
    }
}