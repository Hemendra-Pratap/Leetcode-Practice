class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for(char ch : t.toCharArray()){
            if(i<s.length() && s.charAt(i)==ch){
                i++;
            }
        }

        return i == s.length();
    }
}