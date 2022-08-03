class Solution {
    public static void findsubsets(int in,int[] nums,List<Integer> ds,List<List<Integer>> list) {
        list.add(new ArrayList<>(ds));
        for(int i=in;i<nums.length;i++) {
            if(i!=in && nums[i]==nums[i-1])
                continue;
            ds.add(nums[i]);
            findsubsets(i+1,nums,ds,list);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        findsubsets(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}