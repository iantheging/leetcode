package easy;

import java.util.HashMap;

public class Has_Cycle {

    public static boolean hasCycle(ListNode head) {
        ListNode current = head;
        HashMap<ListNode, Integer> map = new HashMap<>();

        if (current == null) {
            return false;
        }

        while (current.next != null) {
            if (map.containsKey(current.next)) {
                return true;
            }
            else {
                map.put(current, current.val);
                current = current.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println(hasCycle(first));
    }
}
