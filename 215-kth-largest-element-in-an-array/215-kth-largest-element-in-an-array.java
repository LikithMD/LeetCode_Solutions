class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*List arr=Arrays.asList(nums);
        Collections.sort(arr);
        int[] num=arr.toArray();*/
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}