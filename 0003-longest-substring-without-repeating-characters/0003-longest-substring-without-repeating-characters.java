class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, count = 0, max = 0;

        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();

        for(char ch : arr){
            while(set.contains(ch)){
                set.remove(arr[left++]);
                count--;
            }

            set.add(ch);
            count++;
            max = Math.max(count, max);
        }

        return max;
    }
}