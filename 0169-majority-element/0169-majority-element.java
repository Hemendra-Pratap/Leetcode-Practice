class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int el = nums[i];
            if(map.containsKey(el)){
                map.put(el, map.get(el)+1);
            }else{
                map.put(el, 1);
            }
        }

        for(Integer key : map.keySet()){
            if(map.get(key) > n) return key;
        }

        return -1;


        
    }
}