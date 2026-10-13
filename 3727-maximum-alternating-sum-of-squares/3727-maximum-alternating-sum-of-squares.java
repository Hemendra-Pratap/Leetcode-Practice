class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);

        int l=0, r = nums.length-1;
        long max = 0, min = 0;
        while(l < r){

            if(nums[l] == nums[r]){
                l++;
                r--;
                continue; 
            }

            max += nums[r] * nums[r];
            min += nums[l] * nums[l];

            l++;
            r--;
        }
        if(l == r) max += nums[l] * nums[l];

        return max - min;
    }
}