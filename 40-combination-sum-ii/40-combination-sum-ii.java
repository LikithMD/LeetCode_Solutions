class Solution {
    public void combinations(int ind,int[] nums,int x,List<Integer> ds, List<List<Integer>> ans) {
        if(x==0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<nums.length;i++) {
            if(i>ind && nums[i]==nums[i-1])
                continue;
            if(nums[i]>x)
                break;
            ds.add(nums[i]);
            combinations(i+1,nums,x-nums[i],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        combinations(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}