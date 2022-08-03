class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int k = 0;
        for(int num: nums2) {
            Integer count = map.get(num);
            if(count != null && count > 0) {
                nums1[k++] = num;
                map.put(num, count - 1);
            }
        }
        
        return Arrays.copyOfRange(nums1, 0, k);
    }
}