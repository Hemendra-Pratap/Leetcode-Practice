class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        int n = heights.length;

        int[] nextSmallright = new int[n];
        int[] nextSmallleft = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smaller Right
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            nextSmallright[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st = new Stack<>();

        // Next Smaller Left
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            nextSmallleft[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // Calculate area
        for(int i = 0; i < n; i++){
            int height = heights[i];
            int width = nextSmallright[i] - nextSmallleft[i] - 1;
            int currarea = height * width;
            maxarea = Math.max(maxarea, currarea);
        }

        return maxarea;
    }
}
