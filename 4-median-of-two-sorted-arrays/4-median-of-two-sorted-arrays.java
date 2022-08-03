import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                arr[k++]=nums1[i++];
            }
            else {
                arr[k++]=nums2[j++];
            }
        }
        if(i<nums1.length) {
            while(i<nums1.length) {
                arr[k++]=nums1[i++];
            }
        }
        if(j<nums2.length) {
            while(j<nums2.length) {
                arr[k++]=nums2[j++];
            }
        }
        if((nums1.length+nums2.length)%2==0)
            return (double)(arr[(nums1.length+nums2.length)/2]+arr[((nums1.length+nums2.length)/2)-1])/2;
        else
            return arr[((nums1.length+nums2.length+1)/2)-1];
    }
}