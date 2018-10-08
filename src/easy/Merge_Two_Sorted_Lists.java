package easy;

import java.util.List;

public class Merge_Two_Sorted_Lists {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current;
        ListNode head;

        if (l1.val <= l2.val) {
            current = l1;
            l1 = l1.next;
        } else {
            current = l2;
            l2 = l2.next;
        }

        head = current;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = fourth;

        ListNode bFirst = new ListNode(1);
        ListNode bSecond = new ListNode(3);
        ListNode bThird = new ListNode(5);
        bFirst.next = bSecond;
        bSecond.next = bThird;

        ListNode out = mergeTwoLists(first, bFirst);
        while (out != null) {
            System.out.println(out.val);
            out = out.next;
        }
    }
}
