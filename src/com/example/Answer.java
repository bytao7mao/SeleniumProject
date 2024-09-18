package com.example;

class Answer {

    public static void main(String[] args) {
        // This is how your code will be called.
    // You can edit this code to try different testing cases.
        Answer answer = new Answer();
        Answer.ListNode head = answer.new ListNode(7);
        head.next = answer.new ListNode(5);
        head.next.next = answer.new ListNode(3);
        head.next.next.next = answer.new ListNode(4);
        head.next.next.next.next = answer.new ListNode(1);
        System.out.println(head.next.next.next.next);
        int result = Answer.sum(head);
    }
    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

    // Return the sum of the contents in the linked list.
    static int sum(ListNode head) {



        return 0;
    }


}
