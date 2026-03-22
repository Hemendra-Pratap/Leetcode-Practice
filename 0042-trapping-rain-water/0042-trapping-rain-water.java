class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //left max
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        //main loop 
        int tapwater = 0;
        for(int i=0;i<n;i++){
            int water = Math.min(leftmax[i],rightmax[i]);
            tapwater += water - height[i];
        }

        return tapwater;
    }
}