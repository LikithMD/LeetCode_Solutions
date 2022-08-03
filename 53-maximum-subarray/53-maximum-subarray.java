class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++) {
            sum=Math.max(nums[i],nums[i]+sum);
            if(max<sum)
                max=sum;
        }
        return max;
    }
}