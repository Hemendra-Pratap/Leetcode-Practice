class Solution {
    public void solve(int[] arr, List<List<Integer>> res, int idx){
        if (idx >= arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : arr)temp.add(num);
            res.add(temp);
            return;
        }

        for(int i=idx;i<arr.length;i++){
            swap(arr, i, idx);
            solve(arr, res, idx+1);
            swap(arr, i, idx);
        }
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, res, 0);
        return res;
    }
}