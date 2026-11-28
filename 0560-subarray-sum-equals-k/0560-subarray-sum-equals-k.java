class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count= 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}


// brute forcce 
// it will go O(n^2) tc
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;
//         for(int left=0;left<nums.length;left++){
//             int sum = 0;
//             for(int right=left;right<nums.length;right++){
//                 sum += nums[right];
//                 if(sum == k) count++;
//             }
//         }

//         return count;
//     }
// }