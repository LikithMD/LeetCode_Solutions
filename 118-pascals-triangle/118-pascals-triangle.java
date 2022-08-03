class Solution {
    public int factorial(int n) {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        int i,j;
        for(i=1;i<=numRows;i++) {
            int c=1;
            List<Integer> list1=new ArrayList<>();
            for(j=1;j<=i;j++) {
                list1.add(c);
                c=c*(i-j)/j;
            }
            list.add(list1);
        }
        return list;
    }
}