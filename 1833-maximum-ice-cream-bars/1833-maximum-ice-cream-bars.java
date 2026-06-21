class Solution {
    public int sum(int[] arr){
        int sum = 0;
        for(int n: arr) sum += n;
        return sum;
    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // int arrsum  = sum(costs);
        // if(arrsum <= coins) return costs.length;
        int total = coins;
        int count = 0;
        if(costs[0] > coins) return 0;
        if(costs[0] == coins) return 1;

        for(int i=0;i<costs.length;i++){
            if(total >= costs[i]){
                total -= costs[i];
                count++;
            }
        }
        return count;
    }
}