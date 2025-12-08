package LinkedList;

import static LinkedList.ListNode.printList;

public class Q1_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;

            current.next = new ListNode(sum);
            current = current.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        printList(l1);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        printList(l2);

        Q1_AddTwoNumbers q1AddTwoNumbers = new Q1_AddTwoNumbers();
        ListNode listNode = q1AddTwoNumbers.addTwoNumbers(l1, l2);
        printList(listNode);
    }
}

