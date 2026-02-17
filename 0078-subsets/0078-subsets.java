class Solution {
    public static void help(int idx, int[] arr, ArrayList<List<Integer>> res, ArrayList<Integer> list){
        if(idx == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        help(idx+1, arr, res, list);
        list.remove(list.size() - 1); 
        help(idx+1, arr, res, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        help(0, nums, res, list);
        return res;
    }
}