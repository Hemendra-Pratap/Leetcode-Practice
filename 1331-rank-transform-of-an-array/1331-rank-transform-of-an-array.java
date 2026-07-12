class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : list) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}