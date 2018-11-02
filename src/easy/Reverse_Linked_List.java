package easy;

import java.util.ArrayList;

public class Reverse_Linked_List {

    public static ListNode reverseList(ListNode head) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode current = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (current != null) {
            arr.add(current);
            current = current.next;
        }

        ListNode newHead = arr.get(arr.size() - 1);
        ListNode newStart = newHead;
        for (int i = arr.size() - 1; i > 0; i--) {
            newHead.next = arr.get(i - 1);
            newHead = newHead.next;
        }
        return newStart;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        while (first != null) {
            System.out.println(first.val + " -> ");
            first = first.next;
        }

        ListNode ret = reverseList(first);

        while (ret.next != null) {
            System.out.println(ret.val + " -> ");
            ret = ret.next;
        }
    }
}
