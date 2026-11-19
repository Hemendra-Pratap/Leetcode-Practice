class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n , map.getOrDefault(n, 0)+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int num : map.values()){
            if(!set.add(num)){
                return false;
            }
        }

        return true;

        
    }
}