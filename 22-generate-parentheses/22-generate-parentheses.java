import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        if(n<=0)
            return null;
        return parentheses(n,n,"",new ArrayList<String>());
    }
    public List<String> parentheses(int open,int close,String st,ArrayList<String> res) {
        if(open==0 && close==0) 
            res.add(st);
        if(open>0) 
            parentheses(open-1,close,st+"(",res);
        if(close>open) 
            parentheses(open,close-1,st+")",res);
        return res;
    }
}