class Solution {
    public int numRabbits(int[] answers) {
        int count  = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : answers){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
            int groupSize = key + 1;
            int freq = map.get(key);
            int groupsNeeded = (freq + groupSize - 1) / groupSize;
            count += groupSize*groupsNeeded;
        }

        return count;
    }
}