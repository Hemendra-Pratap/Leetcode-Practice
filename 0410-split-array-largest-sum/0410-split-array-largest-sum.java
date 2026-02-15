class Solution {
    public int splitArray(int[] arr, int k) {
       int n = arr.length;
        // if not enough books
        if (n < k) return -1;
        // lower bound = max pages in a single book
        // upper bound = sum of all pages
        int low = 0;
        int high = 0;
        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // can we allocate so no student gets more than mid pages?
            if (canAllocate(arr, k, mid)) {
                ans = mid;
                high = mid - 1;  // try to reduce
            } else {
                low = mid + 1;   // need larger capacity
            }
        }

        return ans;
    }

    // check if maxPagesPerStudent = limit is feasible
    private boolean canAllocate(int[] arr, int k, int limit) {
        int students = 1;
        int sum = 0;

        for (int pages : arr) {
            sum += pages;
            if (sum > limit) {
                // assign current to next student
                students++;
                sum = pages;
                if (students > k) return false;
            }
        }
        return true;                        
    }
}