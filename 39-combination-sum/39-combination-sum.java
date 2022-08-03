class Solution {
    public void combinations(int i,int[] nums,int x,List<Integer> ds,List<List<Integer>> ans) {
        if(i==nums.length) {
            if(x==0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[i]<=x) {
            ds.add(nums[i]);
            combinations(i,nums,x-nums[i],ds,ans);
            ds.remove(ds.size()-1);
        }
        combinations(i+1,nums,x,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combinations(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}