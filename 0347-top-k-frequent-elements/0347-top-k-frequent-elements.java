
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[k];

        int idx = 0;

        while (k > 0) {
            int maxFreq = 0;
            int maxElement = 0;

            // Find element with maximum frequency
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }

            // Store and remove maximum frequency element
            res[idx] = maxElement;
            map.remove(maxElement);

            idx++;
            k--;
        }

        return res;
    }
}
