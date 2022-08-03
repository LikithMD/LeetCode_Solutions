class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        long c=1;
        list.add((int)c);
        for(int i=1;i<=rowIndex;i++) {
            long x=(c*(rowIndex-i+1))/i;
            list.add((int)x);
            c=x;
        }
        return list;
    }
}