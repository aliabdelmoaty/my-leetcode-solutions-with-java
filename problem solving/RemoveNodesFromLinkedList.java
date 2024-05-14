public class RemoveNodesFromLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNodes(ListNode head) {
        ListNode result = new ListNode();
        ListNode current = result;
        ListNode temp = head;
        while (head.next != null) {
            while (head.next.next != null) {
                current.next = head.next.next;
                current = current.next;
                head.next = head.next.next;
            }
            head = head.next;
        }
        if (result.next == null) {
            return temp;
        }

        return result.next;

    }

    public static void main(String[] args) {
        RemoveNodesFromLinkedList r = new RemoveNodesFromLinkedList();
        ListNode head = r.new ListNode(1, r.new ListNode(1, r.new ListNode(1, r.new ListNode(1))));
        ListNode result = r.removeNodes(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
