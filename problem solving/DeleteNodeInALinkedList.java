public class DeleteNodeInALinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void addNode(ListNode node, int val) {
        ListNode n = new ListNode(val);
        while (node.next != null) {
            node = node.next;
        }
        node.next = n;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList d = new DeleteNodeInALinkedList();
        d.addNode(d.new ListNode(4), 5);

    }

}
