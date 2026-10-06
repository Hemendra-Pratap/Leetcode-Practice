class Solution {
    public int minAddToMakeValid(String s) {
        int negitive = 0;
        int counter = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                counter++;
            }else{
                counter--;
            }

            if(counter < 0){
                negitive++;
                counter = 0;
            }
        }

        return counter + negitive;
    // COde - 2 NOT WORKING
        // int count = 0;
        // int leftcount = 0;
        // int rightcount = 0;
        // for(char ch : s.toCharArray()){
        //     if(ch == '('){
        //         leftcount++;
        //     }else {
        //         rightcount++;
        //     }
        //     if( leftcount == rightcount){
        //         leftcount = 0;
        //         rightcount = 0;
        //     }
        //     if(rightcount > 0 && leftcount == 0){
        //         count ++;
        //         rightcount = 0;
        //     }
        // }
        // count += leftcount;
        // return count;

    // Code - 1 - NOT WORKING
        // int l = 0, r = 0;
        // for(char ch : s.toCharArray())   if(ch == '(') l++;  else r++;
        // return Math.abs(l-r);
    }
}