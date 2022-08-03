class Solution {
    public int[] sortArray(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0;
        Arrays.sort(nums);
        for(int x:nums)
        {
            arr[i]=x;
            i++;
        }
        return arr;
    }
}