/**
 * array
 */
public class array {
    private int size;
    private int length;
    private int[] items;

    public array(int arraySize) {
        size = arraySize;
        length = 0;
        items = new int[arraySize];
    }

    public void fill() {
        int no_of_item;
        System.out.println("how many items you want to fill?");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        no_of_item = sc.nextInt();
        if (no_of_item > size) {
            System.out.println("You can't exceed the size of array");
            return;
        } else {
            for (int i = 0; i < no_of_item; i++) {
                System.out.println("Enter the item" + (i + 1) + ":");
                items[i] = sc.nextInt();
                length++;
            }
        }
        

    }

    void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(items[i] + "     ");
        }
        System.out.println("\n");
    }

    int lengthArray() {
        return length;
    }

    int sizeArray() {
        return size;
    }

    int search(int key) {
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (items[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }

    void append(int newItem) {
        if (length < size) {
            items[length] = newItem;
            length++;
        } else {
            System.out.println("Array is full");
        }
    }

    void insert(int index, int newItem) {
        if (index >= 0 && length < size) {
            for (int i = length; i > index; i--) {
                items[i] = items[i - 1];

            }
            items[index] = newItem;
            length++;
        } else {
            System.out.println("Index is not valid");
        }
    }

    void delete(int index) {
        if (index >= 0 && index < length) {
            for (int i = index; i < length; i++) {
                items[i] = items[i + 1];
                length--;
            }
        } else {
            System.out.println("Index is not valid");
        }
    }

    void enlarge(int newSize) {
        if (newSize <= size) {
            System.out.println("New size should be greater than the current size");
            return;
        } else {
            size = newSize;
            int[] old = items;
            items = new int[size];
            for (int i = 0; i < length; i++) {
                items[i] = old[i];
            }
            old=null;
        }

    }

}
