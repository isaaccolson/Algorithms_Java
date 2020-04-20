package com.company;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;

        while (true) {
            if (l1 == null || l2 == null) {
                tail.next = nl == null ? n2 : n1;
                return dummyHead.next;
            }

            if (l1.val <= l2.val) {
                tail.next = l1.val;
                l1 = l1.next;
            } else {
                tail.next = l2.val;
                l2 = l2.next;
            }
            tail = tail.next;
        }
    }
}
