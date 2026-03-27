import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[m+n];
        for(int i = 0;i<n;i++){
            arr[i] = nums1[i];
        }
        for(int i = 0;i<m;i++){
            arr[n+i] = nums2[i];
        }

        Arrays.sort(arr);

        int total = m + n;
        if (total == 1) {
            return arr[0]; 
        }
        
        if (total % 2 == 1) {
            return arr[total / 2];
        } else {
            return (arr[total / 2] + arr[total / 2 - 1]) / 2.0;
        }
    }
}