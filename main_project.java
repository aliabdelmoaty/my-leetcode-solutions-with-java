import java.util.Scanner;

public class main_project {
    public static void main(String[] args) {
        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Create an instance of the array class
        array arr = new array(size);

        System.out.println("---------------------------------------------------");

        // Fill the array with random numbers
        arr.fill();

        System.out.println("---------------------------------------------------");
        System.out.println("Items in the array are:");

        // Display the items in the array
        arr.display();

        // System.out.println("---------------------------------------------------");

        // // Print the length of the array
        // System.out.println("Length of array is: " + arr.lengthArray());

        // System.out.println("---------------------------------------------------");

        // // Print the size of the array
        // System.out.println("Size of array is: " + arr.sizeArray());

        // System.out.println("---------------------------------------------------");

        // // Prompt the user to enter the item to search
        // System.out.println("Enter the item you want to search");
        // int key = sc.nextInt();

        // // Search for the item in the array
        // arr.search(key);

        // // Check if the item was found or not
        // if (arr.search(key) == -1) {
        // System.out.println("Item not found");
        // } else {
        // System.out.println("Item found at index: " + arr.search(key));
        // }

        // System.out.println("---------------------------------------------------");

        // // Prompt the user to enter the item to append
        // System.out.println("Enter the item you want to append");
        // int newItem = sc.nextInt();

        // // Append the item to the array
        // arr.append(newItem);

        // System.out.println("---------------------------------------------------");
        // System.out.println("Items in the array are:");

        // // Display the items in the array
        // arr.display();

        // System.out.println("---------------------------------------------------");

        // // Prompt the user to enter the index and item to insert
        // System.out.println("Enter the index where you want to insert the item");
        // int index = sc.nextInt();
        // System.out.println("Enter the item you want to insert");
        // newItem = sc.nextInt();

        // // Insert the item at the specified index
        // arr.insert(index, newItem);

        // System.out.println("---------------------------------------------------");

        // // Display the items in the array
        // arr.display();

        // System.out.println("---------------------------------------------------");

        // // Prompt the user to enter the index to delete
        // System.out.println("Enter the index where you want to delete the item");
        // index = sc.nextInt();

        // // Delete the item at the specified index
        // arr.delete(index);

        // System.out.println("---------------------------------------------------");

        // // Display the items in the array
        // arr.display();

        // System.out.println("---------------------------------------------------");

        // // Prompt the user to enter the new size of the array
        // System.out.println("Enter the size where you want to change the array");
        // size = sc.nextInt();

        // // Change the size of the array
        // arr.enlarge(size);

        // System.out.println("---------------------------------------------------");

        // // Print the length of the array
        // System.out.println("Length of array is: " + arr.lengthArray());

        // System.out.println("---------------------------------------------------");

        // // Print the size of the array
        // System.out.println("Size of array is: " + arr.sizeArray());

        // System.out.println("---------------------------------------------------");

        // // Display the items in the array
        // arr.display();
        System.out.println("---------------------------------------------------");
        array other = new array(5);
        other.fill();
        System.out.println("---------------------------------------------------");
        other.display();
        System.out.println("---------------------------------------------------");
        arr.merge(other);
        System.out.println("---------------------------------------------------");
        arr.display();
        System.out.println("---------------------------------------------------");
    }
}
