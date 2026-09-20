class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // 'a' becomes 26, 'b' becomes 25, ..., 'z' becomes 1
            int value = 26 - (ch[i] - 'a');
            res += (i+1) * value;
        }
        return res;
    }
}
