class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS=new int[nums.length];
        for(int i=nums.length;i>=0;i--) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]<nums[j]) {
                    LIS[i]=Math.max(LIS[i],1+LIS[j]);
                }
            }
        }
        Arrays.sort(LIS);
        return LIS[nums.length-1]+1;
    }
}