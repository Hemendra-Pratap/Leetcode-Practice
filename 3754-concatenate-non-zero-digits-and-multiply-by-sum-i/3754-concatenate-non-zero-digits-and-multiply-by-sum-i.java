class Solution {
    public long sumAndMultiply(int n) {
        long res  = 0;
        int sum = 0;

        while(n != 0){
            int ld = n % 10;
            if(ld != 0){
                sum += ld;
                res = res * 10 + ld;
            }
            n /= 10;
        }
        
        long sol = 0;
        while(res != 0){
            long ld = res % 10;
            sol = sol * 10 + ld;
            res /= 10;
        }


        return sol*sum;

    }
}