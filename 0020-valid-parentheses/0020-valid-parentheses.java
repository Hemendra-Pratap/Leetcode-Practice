class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        for(char ch : arr){
            if(ch == '{' || ch =='(' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if(ch == '}' && st.peek() == '{' ||
                ch == ']' && st.peek() == '[' ||
                ch == ')' && st.peek() == '('){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}