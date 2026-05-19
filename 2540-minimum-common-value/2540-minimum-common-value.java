class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int idx1 = 0;
        int idx2 = 0;

        while(idx1 < n && idx2 < m){
            if(nums1[idx1] < nums2[idx2]){
                idx1++;
            }
            else if(nums1[idx1] > nums2[idx2]){
                idx2++;
            }
            else{
                return nums1[idx1];
            }           
        }
        return -1;
    }
}