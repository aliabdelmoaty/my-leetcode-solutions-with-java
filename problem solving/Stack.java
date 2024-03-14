import java.util.Scanner;

public class Stack<T> {
    private int top;
    private Object[] items;
    final int sizeArray = 10;

    public Stack() {
        top = -1;
        items = new Object[sizeArray];

    }

    public void push(Object element) {

        if (top >= sizeArray - 1) {
            System.out.println("stack is full");

        } else {
            top++;
            items[top] = element;
        }
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            top--;
        }
    }

    public void pop(Object element) {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            element = items[top];
            top--;

        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("number: " + items[i]);
        }

    }

    public Object getTop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        return items[top];

    }

    public static void main(String[] args) {
        Stack<Character> mSqrt = new Stack<Character>();
        for (int i = 0; i < 3; i++)

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter item to push");
            Character item = sc.next().charAt(0);
            mSqrt.push(item);
        }
        System.out.println("-----------------------------------");

        mSqrt.print();
        System.out.println("-----------------------------------");

        mSqrt.pop();
        mSqrt.push("alolo");
        mSqrt.print();
        System.out.println("-----------------------------------");
        System.out.println(mSqrt.getTop() + " this item in top");
        // char[] character = { 'h', 'e', 'l', 'l', 'o' };
        // mSqrt.reverseString(character);
    }

}
