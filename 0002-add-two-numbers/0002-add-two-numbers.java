class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = l1;
        ListNode prev = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            int currsum = a + b + carry;

            if (currsum < 10) {
                if (l1 != null) l1.val = currsum;
                else {
                    prev.next = new ListNode(currsum);
                    l1 = prev.next;
                }
                carry = 0;
            } else {
                int ld = currsum % 10;

                if (l1 != null) l1.val = ld;
                else {
                    prev.next = new ListNode(ld);
                    l1 = prev.next;
                }

                carry = currsum / 10;
            }

            prev = l1;
            l1 = l1.next;

            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return head;
    }
}