class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff=0;
        int ans=Integer.MAX_VALUE;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k) {
                sum=nums[i]+nums[j]+nums[k];
                diff=Math.abs(sum-target);
                if(diff<ans) {
                    ans=diff;
                    res=sum;
                }
                if(sum>target)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }
}