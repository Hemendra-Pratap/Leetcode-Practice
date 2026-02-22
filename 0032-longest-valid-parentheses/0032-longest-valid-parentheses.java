class Solution {
    public int longestValidParentheses(String s) {
        int left=0, right=0, max=0;

        // ye check hua h right se left ke liye
        for(char ch : s.toCharArray()){
            if(ch == '(' ) left++;
            else right++;
            if(right == left) max = Math.max(left*2, max);
            else if(right > left ){
                right = 0;
                left = 0;
            }
        }

        // ab left se right ke liye check hoga 
        right = 0;
        left = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch == '(' ) left++;
            else right++;
            if(right == left) max = Math.max(left*2, max);
            else if(right < left ){
                right = 0;
                left = 0;
            }
        }


        return max;
        
    }
}