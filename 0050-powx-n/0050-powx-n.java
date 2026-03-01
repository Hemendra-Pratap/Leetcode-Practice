class Solution {
    private static double power(double x, long N){
        if(N==0) return 1;
        double half = power(x, N/2);
        if(N%2==0){
            return half * half;
        }else{
            return half*half*x;
        }
    }

    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        long N = n;
        if(N<0){
            x = 1/x;
            N = -N;
        }
       return power(x,N);

    }
    
}