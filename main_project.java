import java.util.Scanner;

public class main_project {
    public static void main(String[] args) {
       LinkedList linkedList =new LinkedList();
       if(linkedList.isEmpty()){
           System.out.println("The list is empty");
       }else{
              System.out.println("The list is not empty");
              System.out.println(linkedList.count());
       }
       System.out.println("--------------------------------------------------");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number insert to list");
       int num =sc.nextInt();
       System.out.println("Enter item to insert list");
       int i =0;
       while (num >i) {
       int insert = sc.nextInt();
       linkedList.firstInsert(insert, num);
        i++;
       }
       System.out.println("--------------------------------------------------");
       linkedList.display();
       System.out.println("--------------------------------------------------");
       System.out.println("count linked list: "+linkedList.count());
       System.out.println("--------------------------------------------------");
       System.out.println("enter item to search");
       int search =sc.nextInt();
       linkedList.isFound(search);
       sc.close();
       if (linkedList.isFound(search)==true) {
        System.out.println("we found item");
       }else{
        System.out.println("we can't found item");
       }
       System.out.println("--------------------------------------------------");

    }
}
