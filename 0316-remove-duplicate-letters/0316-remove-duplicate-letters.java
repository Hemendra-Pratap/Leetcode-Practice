class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : s.toCharArray()){
            freq[ch - 'a']--;

            if(st.contains(ch)) continue;

            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0) {
                st.pop();
            }

            st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}