class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target) {
                x=i;
            }
            if(target>nums[i]) {
                x=i+1;
            }
        }
        return x;
    }
}