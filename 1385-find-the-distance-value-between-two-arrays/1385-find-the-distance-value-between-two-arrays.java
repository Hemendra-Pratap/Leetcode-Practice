class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean[] res = new boolean[arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int diff = Math.abs(arr1[i] - arr2[j]);
                if(diff > d){
                    res[i] = true;
                }else{
                    res[i] = false;
                    break;
                }
            }
        }

        for(int i=0;i<res.length;i++){
            if(res[i] == true){
                count++;
            }
        }
        return count;
        
    }
}