class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int idx1 = 0;
        int[] neg = new int[nums.length/2];
        int idx2 = 0;
        for(int n : nums){
            if(n < 0){
                neg[idx2] = n;
                idx2++;
            }
            if(n > 0){
                pos[idx1] = n;
                idx1++;
            }
        }
        int[] res = new int[nums.length];
        int p = 0;
        int n = 0;
        for(int i=0;i<res.length;i++ ){
            if(i%2==0){
                res[i] = pos[p];
                p++;
            }

            if(i%2!=0){
                res[i] = neg[n];
                n++;
            }
        }

        return res;
    }
}