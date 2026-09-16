class Solution {
    public int help(int[] nums, int key, int left, int right){
        if(left>right) return -1;

        int mid = left + (right-left)/2;

        if(nums[mid]==key) return mid;

        else if(key > nums[mid]){
            left =  mid+1;
        }else{
            right =  mid-1;
        }

        return help(nums, key, left, right);
    }
    public int search(int[] nums, int target) {
        int ans = help(nums, target, 0, nums.length-1);
        return ans;

        
        // int idx = Arrays.binarySearch(nums, target);
        // return idx >= 0 ? idx : -1;

    //    int left = 0;
    //    int right = nums.length-1;
    //    while(left <= right){
    //         int mid = (left+right)/2;
    //         if(target == nums[mid]) return mid;
    //         else if( target > nums[mid]){
    //             left = mid+1;
    //         }else{
    //             right = mid-1;
    //         }
    //    }

    //    return -1;
    }
}