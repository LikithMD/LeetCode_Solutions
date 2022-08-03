class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int max=1,min=1;
        for(Integer val: nums) {
            int temp=max*val;
            max=Math.max(max*val,Math.max(min*val,val));
            min=Math.min(temp,Math.min(min*val,val));
            res=Math.max(res,max);
        }
        return res;
    }
}