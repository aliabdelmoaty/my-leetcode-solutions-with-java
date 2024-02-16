import java.util.Scanner;

public class main_project {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        array arr = new array(size);
        System.out.println("---------------------------------------------------");
        arr.fill();
        System.out.println("---------------------------------------------------");
        System.out.println("Items in the array are:");
        arr.display();
        System.out.println("---------------------------------------------------");
        System.out.println("Length of array is: " + arr.lengthArray());
        System.out.println("---------------------------------------------------");

        System.out.println("Size of array is: " + arr.sizeArray());
        System.out.println("---------------------------------------------------");

        System.out.println("Enter the item you want to search");
        int key = sc.nextInt();
        arr.search(key);
        if (arr.search(key) == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at index: " + arr.search(key));
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the item you want to append");
        int newItem = sc.nextInt();
        arr.append(newItem);
        System.out.println("---------------------------------------------------");
        System.out.println("Items in the array are:");
        arr.display();
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the index where you want to insert the item");
        int index = sc.nextInt();
        System.out.println("Enter the item you want to insert");
        newItem = sc.nextInt();
        arr.insert(index, newItem);
        System.out.println("---------------------------------------------------");
        arr.display();
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the index where you want to delete the item");
        index = sc.nextInt();
        arr.delete(index);
        System.out.println("---------------------------------------------------");
        arr.display();
    }
}
