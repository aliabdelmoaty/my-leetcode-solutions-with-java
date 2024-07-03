
public class RemoveLinkedListElements {

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

 public ListNode removeElements0(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return dummy.next;
 }
    public ListNode removeElements(ListNode head, int val) {
        ListNode delete;
        if (head.val == val) {
            // delete = head;
            head = head.next;
            // delete = null;
        } else {
            ListNode prev = null;
            delete = head;
            while (delete.val != val) {
                prev = delete;
                delete = delete.next;
            }
            prev.next = delete.next;
            delete = null;
        }
        return head;
        // ListNode lNode;
        // lNode = head;
        // int i = 0;
        // while (lNode != null) {

        // if (lNode.val == val) {
        // // System.out.println(++i + " :f");
        // lNode = lNode.next;
        // } else if (lNode.next != null) {
        // // System.out.println(++i + " :l or m");

        // if (lNode.next.next == null) {
        // // System.out.println(++i + " :l ");

        // lNode.next = null;
        // } else {
        // // System.out.println(++i + " :m ");
        // lNode = lNode.next.next;

        // }
        // } else {
        // lNode = lNode.next;
        // }
        // System.out.println(lNode.val + " : lNode.val");
        // }
        // return lNode;

    }

    public static void main(String[] args) {
        RemoveLinkedListElements r = new RemoveLinkedListElements();
        ListNode head = r.new ListNode(7);
        head.next = r.new ListNode(5);
        head.next.next = r.new ListNode(2);
        head.next.next.next = r.new ListNode(3);
        // head.next.next.next.next = r.new ListNode(7);
        // head.next.next.next.next.next = r.new ListNode(7);
        // head.next.next.next.next.next.next = r.new ListNode(7);
        ListNode result = r.removeElements(head, 7);
        while (result != null) {
            System.out.println(result.val + " : result.val");
            result = result.next;
        }
    }

}
