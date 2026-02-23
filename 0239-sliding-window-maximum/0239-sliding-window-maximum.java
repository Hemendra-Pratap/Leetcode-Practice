class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];
        int j = 0;

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < nums.length; i++) {

            // 1. remove out-of-window indices
            if(!queue.isEmpty() && queue.getFirst() <= i - k){
                queue.removeFirst();
            }

            // 2. remove smaller elements from back
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[i]){
                queue.removeLast();
            }

            // 3. add current index
            queue.addLast(i);

            // 4. record result when window is ready
            if(i >= k - 1){
                res[j++] = nums[queue.getFirst()];
            }
        }

        return res;
    }
}