class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==null)
            return false;
        if(magazine==null)
            return false;
        if(magazine.length()<ransomNote.length())
            return false;
        int[] count=new int[26];
        for(char c:magazine.toCharArray())
            ++count[c-'a'];
        for(char ch:ransomNote.toCharArray())
            if(--count[ch-'a']<0)
                return false;
        return true;
    }
}