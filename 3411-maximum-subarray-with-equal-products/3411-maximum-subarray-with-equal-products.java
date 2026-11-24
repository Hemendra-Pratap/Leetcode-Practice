class Solution {

    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
    public int maxLength(int[] nums) {
        int n = nums.length;
        int prod = 1, ret = 2;
        for (int l = 0, r = 0; l < n; ++l) {
            while (r < n && gcd(prod, nums[r]) == 1) {
                prod *= nums[r];
                ++r;
            }
            ret = Math.max(ret, r - l);
            prod /= nums[l];
        }
        return ret;
    }
}