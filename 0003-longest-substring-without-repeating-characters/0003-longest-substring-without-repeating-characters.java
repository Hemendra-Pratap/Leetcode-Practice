class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int left = 0;
        int max = 0;
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char ch : arr){
            while(!set.add(ch)){
                set.remove(arr[left++]);
                count--;
            }
            count++;
            max = Math.max(count,max);
        }

        return max;
    }
}