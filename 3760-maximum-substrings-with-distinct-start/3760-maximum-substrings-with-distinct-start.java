class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for(char ch : s.toCharArray()) set.add(ch);
        return set.size();
    }
}
// class Solution {
//     public int maxDistinct(String s) {
//         if(s.length() == 0) return 0;
//         if(s.length() == 1) return 1;
        
//         char ch = s.charAt(0);
//         int count = 1;
//         for(int i=1;i<s.length();i++){
//             if(ch == s.charAt(i)){
//                 continue;
//             }
//             count++;
//         }

//         return s.length();
//     }
// }
