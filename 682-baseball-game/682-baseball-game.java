class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=ops.length;
        int total=0;
        for(int i=0;i<ops.length;i++) {
            if(ops[i].equals("+")) {
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
            }
            else if(ops[i].equals("D")) {
                arr.add(2*arr.get(arr.size()-1));
            }
            else if(ops[i].equals("C")) {
                arr.remove(arr.size()-1);
            }
            else {
                arr.add(Integer.parseInt(ops[i]));
            }
    }
        for(int x:arr)
            total+=x;
        return total;
}
}