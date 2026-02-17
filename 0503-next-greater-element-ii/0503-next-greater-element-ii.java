class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nextbig = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        // nextbig[nums.length-1] = -1;
        for(int i=2*nums.length-1;i>=0;i--){
            int curr = nums[i % nums.length];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if(i < nums.length){
                if(st.isEmpty())
                    nextbig[i] = -1;
                else
                    nextbig[i] = st.peek();
            }

            st.push(curr);
        }

        return nextbig;
    }
}