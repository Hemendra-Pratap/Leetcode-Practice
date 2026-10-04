class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                low++;
                high++;
            } 
            else if (c == ')') {
                low--;
                high--;
            } 
            else { // '*'
                low--;
                high++;
            }

            low = Math.max(low, 0);

            if (high < 0) {
                return false;
            }
        }

        return low == 0;
    }
}

// class Solution {
//     public boolean solve(String s, int idx, int count){
//         if(count < 0) return false;
//         if(idx == s.length()){
//             return (count == 0);
//         }

//         if(s.charAt(idx) == '('){
//             solve(s, idx+1, count+1);
//         }

//         if(s.charAt(idx) == ')'){
//             solve(s, idx+1, count-1);
//         }

//         return solve(s, idx+1, count+1)|| solve(s, idx+1, count-1) || solve(s, idx+1, count);
//     }
//     public boolean checkValidString(String s) {
//         int count = 0;
//         return  solve(s, 0, count);

//     }
// }