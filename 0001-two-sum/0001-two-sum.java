class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int  i = 1 ;i<nums.length;i++){
            for(int j = i;j<nums.length; j++){
                int currentnumber = nums[j]+ nums[j-i];
            if(currentnumber == target) return new int[] {j,j-i};
            }
        }
        return new int []{};
    }
}