
class LinkedList {
  public Node head;

  public LinkedList() {
    head = null;

  }

  boolean isEmpty() {
    if (head == null) {
      return true;
    } else {
      return false;
    }
  }

  void firstInsert(int newVal,int numItems) {
    Node newNode = new Node();
    newNode.data = newVal;
    if (isEmpty()) {
      newNode.next = null;
      head = newNode;
    } else {
        newNode.next = head;
        head = newNode;

    }
  }

  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  int count() {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;
  }

  boolean isFound(int key) {
    boolean found = false;
    Node temp = head;
    while (temp != null) {
      if (key == temp.data) {
        found = true;
        break;
      }
      temp = temp.next;
    }
    return found;
  }
}

class Node {
  public int data;
  public Node next;
}
