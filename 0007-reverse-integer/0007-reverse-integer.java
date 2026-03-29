class Solution {
    public int reverse(int x) {
        int re = 0;
        while (x != 0) {
            int ld = x % 10;

            // ye check karega overflow condition 
            if (re > Integer.MAX_VALUE / 10 || (re == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }
            // ye check karegea under flow contions 
            if (re < Integer.MIN_VALUE / 10 || (re == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }

            re = re * 10 + ld; 
            x = x / 10; 
        }
        return re;
    }
}