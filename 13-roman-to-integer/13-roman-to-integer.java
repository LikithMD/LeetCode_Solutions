class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] arr=s.toCharArray();
        int sum=0;
        int prev=map.get(arr[0]);
        for(int i=0;i<arr.length;i++) {
            int val=map.get(arr[i]);
            if(val>prev) {
                sum-=prev;
                sum+=(val-prev);
            }
            else {
                sum+=val;
            }
            prev=val;
        }
        return sum;
    }
}