class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        if(word1.length() == 0) return word2;
        if(word2.length() == 0) return word1;

        StringBuilder sb = new StringBuilder();
        int idx1 = 0;
        int idx2 = 0;
        for(int i=0;i<=100;i++){
            if(word1.length() != idx1 && word2.length() != idx2 ){
                sb.append(arr1[idx1]);
                sb.append(arr2[idx2]);
                idx1++;
                idx2++;
            }
            else{
                break;
            }
        }

        if(idx1==word1.length()){
            for(int i=idx2;i<word2.length();i++){
                sb.append(arr2[i]);
            }
        }
        if(idx2==word2.length()){
            for(int i=idx1;i<word1.length();i++){
                sb.append(arr1[i]);
            }
        }

        return sb.toString();
    }
}