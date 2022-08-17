class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(String word:words) {
            StringBuilder str=new StringBuilder();
            for(char ch:word.toCharArray())
                str.append(morse[ch-'a']);
            set.add(str.toString());
        }
         return set.size();
    }
}