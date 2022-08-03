class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();
        int n=columnNumber-1;
        while(n>=0) {
            int rem=n%26;
            str.insert(0,(char)('A'+rem));
            n=(n/26)-1;
        }
        return str.toString();
    }
}