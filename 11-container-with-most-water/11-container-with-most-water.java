class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=Integer.MIN_VALUE,area=0;
        while(l<r) {
            area=(r-l)*Math.min(height[l],height[r]);
            max=Math.max(area,max);
            if(height[l]<=height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}