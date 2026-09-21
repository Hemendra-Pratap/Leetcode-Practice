class Solution {
    public void solve(int[] nums, List<List<Integer>> res, List<Integer> list, int i){
        if(i == nums.length){
            res.add(new ArrayList(list));
            return;
        }
        // int curr = nums[i];
        // pick / include 
        list.add(nums[i]);
        solve(nums, res, list, i+1);

        // not pick , exclude 
        list.remove(list.size()-1);
        solve(nums, res, list, i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums, res, list, 0);
        return res;
    }
}