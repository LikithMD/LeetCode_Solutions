class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),list);
        return list;
    }
    public void backtrack(int[] nums,List<Integer> arr,List<List<Integer>> list) {
        if(arr.size()==nums.length) {
            list.add(new ArrayList<>(arr));
        }
        else {
            for(int i=0;i<nums.length;i++) {
                if(arr.contains(nums[i]))
                    continue;
                arr.add(nums[i]);
                backtrack(nums,arr,list);
                arr.remove(arr.size()-1);
            }
        }
    }
}