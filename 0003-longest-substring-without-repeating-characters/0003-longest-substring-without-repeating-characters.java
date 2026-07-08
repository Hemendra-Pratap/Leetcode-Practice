class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, count=0, max=0;
        
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char ch : arr){
            while(set.contains(ch)){
                set.remove(arr[left]);
                left++;
                count--;
            }

            set.add(ch);
            count++;
            max= Math.max(max, count);
        } 
        return max;
    }
}