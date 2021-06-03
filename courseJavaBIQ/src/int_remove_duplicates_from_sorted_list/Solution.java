package int_remove_duplicates_from_sorted_list;

public class Solution {
    public static void main(String[] args) {

        ListNode head = new ListNode();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        deleteDuplicates(head);

    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.next.val == current.val){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
}
