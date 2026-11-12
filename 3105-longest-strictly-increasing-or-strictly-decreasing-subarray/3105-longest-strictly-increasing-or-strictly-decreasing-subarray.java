class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int best = 0, up = 0, down = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] > nums[i])up++;
            else up = 0;

            if(nums[i+1] < nums[i]) down++;
            else down = 0;

            best = Math.max(best,Math.max(up, down));
        }

        return best+1;
    }
}