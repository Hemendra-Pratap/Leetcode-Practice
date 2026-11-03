class Solution {
    public int minMoves(int[] nums) {
        int max = -1;
        for(int n :nums){
            max = Math.max(max, n);
        }

        int count = 0;
        for(int n : nums){
            count += max - n;
        }


        return count;
    }
}