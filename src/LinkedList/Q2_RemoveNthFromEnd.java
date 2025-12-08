/* 19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
*/
package LinkedList;
import static LinkedList.ListNode.printList;

public class Q2_RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by n steps
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move fast to the end, slow will be just before the target
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the node
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        printList(l1);
        int n = 2;
        ListNode listNode = removeNthFromEnd(l1, n);
        printList(listNode);
    }
}
