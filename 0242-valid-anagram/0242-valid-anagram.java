class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() > s.length()) return false;
        char[] st1 = s.toCharArray();
        char[] st2 = t.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        // if(st1.equals(st2)) return true;


        return Arrays.equals(st1, st2);
    }
}