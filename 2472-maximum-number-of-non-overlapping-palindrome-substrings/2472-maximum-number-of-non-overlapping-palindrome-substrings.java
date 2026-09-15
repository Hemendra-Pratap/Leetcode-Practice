class Solution {

    public boolean ispd(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public int maxPalindromes(String s, int k) {

        int count = 0;
        int start = 0;

        while (start + k <= s.length()) {

            boolean found = false;

            // Check palindrome of length k
            StringBuilder sb = new StringBuilder();

            for (int i = start; i < start + k; i++) {
                sb.append(s.charAt(i));
            }

            if (ispd(sb.toString())) {
                count++;
                start = start + k;
                found = true;
                continue;
            }

            // Check palindrome of length k + 1
            if (start + k + 1 <= s.length()) {

                sb.setLength(0);

                for (int i = start; i < start + k + 1; i++) {
                    sb.append(s.charAt(i));
                }

                if (ispd(sb.toString())) {
                    count++;
                    start = start + k + 1;
                    found = true;
                    continue;
                }
            }

            // No palindrome starting here
            start++;
        }

        return count;
    }
}