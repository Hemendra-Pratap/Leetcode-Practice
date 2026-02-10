class Solution {
    public int help(int pos, int n, boolean [] used){
        if(pos > n){
            return 1;
        }
        int count = 0;
        for(int i=1;i<=n;i++){
            if(!used[i] && (i%pos==0 || pos%i==0)){
                used[i] = true;
                count += help(pos+1,n, used);
                used[i] = false;
            }
        }
        return count;
    }
    public int countArrangement(int n) {
        if(n==0) return 0;
        boolean[] used = new boolean[n+1];
        return help(1 , n, used);
    }
}