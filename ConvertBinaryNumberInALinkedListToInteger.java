
public class ConvertBinaryNumberInALinkedListToInteger {

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

    public int getDecimalValue0(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
        
    }
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = (num << 1) | head.val;
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger obj = new ConvertBinaryNumberInALinkedListToInteger();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(0);
        head.next.next = obj.new ListNode(1);
        System.out.println(obj.getDecimalValue(head));
    }
}
