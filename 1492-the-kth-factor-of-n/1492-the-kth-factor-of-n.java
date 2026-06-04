class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();

        res.add(1); //add 1 cause its every numbers factor
        for(int i=2;i<=n/2;i++){
            if(n%i==0) res.add(i);
        }
        res.add(n);// add n cause it the factor 

        if(res.size() < k) return -1;

        int result = res.get(k-1);
        return result;
    }
}