class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] vis = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch : s.toCharArray()){
            freq[ch - 'a']--;
            if(vis[ch-'a']) continue;
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                char rem = st.pop();
                vis[rem - 'a'] = false;
            }
            st.push(ch);
            vis[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            sb.append(ch);
        }

        return sb.reverse().toString();

        

    }
}