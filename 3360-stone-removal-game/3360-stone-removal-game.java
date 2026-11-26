class Solution {
    public boolean canAliceWin(int n) {
       int count = 10;
       int who = 0;
       boolean che = false;
       while(n >= count ) {
            // Alice
            if(who == 0){
                n = n - count;
                if(n >=0){
                    che = true;
                    who = 1;
                }else{
                    return false;
                }
            }
            //bob
            else if( who == 1){
                n = n - count;
                if(n>=0){
                    che = false;
                    who = 0;
                }else{
                    return true;
                }
            }
            count--;

        } 

       return che;
    }
}