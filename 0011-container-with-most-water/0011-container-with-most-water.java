class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int wid = right - left;
            int minhight = Math.min(height[left], height[right]);
            int area = wid * minhight;
            maxArea = Math.max(maxArea, area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}