class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int zerocount = 0;
        int n = nums.length;

        for(int num : nums){
            if( num != 0 ) product *= num;
            else zerocount++;
        }

        for(int i=0; i<n; i++){
            if(zerocount > 1 ) {
                result[i] = 0;
            } 
            else if(zerocount == 1 ) {
               result[i] = (nums[i] == 0) ? product : 0;
            } 
            else {
                result[i] = product/nums[i];
            }
        }

        return result;
    }
}