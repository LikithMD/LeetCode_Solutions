class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()) {
            if(!set.add(ch))
                return ch;
        }
        throw new RuntimeException("s should contain atleast one two times appeared character");
    }
}