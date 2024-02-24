public class stack {
    Node top;
    
    public stack() {
        top = null;
    }
    public void push(int item){
        if (isEmpty()) {
            
        }
    }
   
    public int pop(){} 
    public void display(){}
    public boolean isEmpty(){
        if (top ==null) {
            return true;
        }
            return false;
        

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
