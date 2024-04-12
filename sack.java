
public class sack {
    Node top;
    
    public sack() {
        top = null;
    }
    public void push(int item){
        Node newNode = new Node();
        newNode.data = item;
        if (isEmpty()) {
            newNode.next = null;
            top =newNode;
        }else{
            
            newNode.next =top;
            top =newNode;
        }
    }
   
    public int pop(){
        int value;
        Node delete =top;
        value =top.data;
        top =top.next;
        delete=null;
        return value;
    } 
    public void display(){
       Node temp =top;
       while (temp != null) {
        System.out.println(temp.data);
        temp=temp.next;
       }
    }
    public boolean isEmpty(){
        if (top ==null) {
            return true;
        }
            return false;
    }
    
    public int peek(){
        return top.data;
    }
    public int count (){
        int count=0;
        Node temp = top;
        while (temp != null) {
            count ++;
            temp = temp.next;
        }
        return count;
    }
   public boolean isFound(int item){
    boolean found =false;
       Node temp = top;
       while (temp != null) {
        if (item ==temp.data) {
            return !found;
           
        }
        temp = temp.next;
       }
       return found;
   }
}

class Node {
    public int data;
    public Node next;
    Node(){
        data =0;
        next =null;
    }
}
