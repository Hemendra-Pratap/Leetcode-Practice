class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char str : s.toCharArray()){
            map.put(str, map.getOrDefault(str, 0) +1);
        }

        for(char st : t.toCharArray()){
            map.put(st, map.getOrDefault(st, 0) -1);
        }


        return map.values().stream().allMatch(value -> value == 0);


        
    }
}