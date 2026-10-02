class Solution {
    public void solve(String current, int n , List<String> ans){
         if (current.length() == 2 * n) {
            if (isValid(current)) {
                ans.add(current);
            }
            return;
        }
        // '(' add karo
        solve(current + "(", n, ans);
        // ')' add karo
        solve(current + ")", n, ans);
    }

    public boolean isValid(String s) {
        int balanced = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balanced++;
            }
            else {
                balanced--;
            }
            // Closing bracket zyada ho gaya
            if (balanced < 0) {
                return false;
            }
        }
        return balanced == 0;
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("", n, res);
        return res;
    }
}