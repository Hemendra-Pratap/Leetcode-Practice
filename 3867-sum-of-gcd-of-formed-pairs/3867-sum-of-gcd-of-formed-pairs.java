class Solution {
    public int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefiGcd = new int[n];

        int currmax = nums[0];
        for(int i=0;i<n;i++){

            if(nums[i] > currmax){
                currmax = nums[i];
            }

            prefiGcd[i] = gcd(currmax, nums[i]);
        }
        Arrays.sort(prefiGcd);

        int left = 0, right = n-1;
        long ans = 0;
        while(left < right){
            ans += gcd(prefiGcd[left], prefiGcd[right]);
            left++;
            right--;
        }
        return ans;

    }
}