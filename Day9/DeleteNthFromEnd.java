package com.palle;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteNthFromEnd {
    
    public static void removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Delete the target node
        second.next = second.next.next;
      
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "-> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        printList(head);

        removeNthFromEnd(head, 2);

        System.out.print("After deleting 2nd from end: ");
        printList(head);
    }
}

