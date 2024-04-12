import java.util.Scanner;

public class main_project {
    public static void main(String[] args) {
        int item;
        sack st = new sack();
        for (int i = 0; i < 5; i++) {
            System.out.print("enter item: ");
            Scanner sc = new Scanner(System.in);
            item = sc.nextInt();
            st.push(item);
            System.out.println("-------------------------------------------");
            st.display();
            System.out.println("-------------------------------------------");
        }
        System.out.println(st.pop());
        System.out.println("-------------------------------------------");
        st.display();
        System.out.println("-------------------------------------------");
        System.out.println(st.isFound(5));
        System.out.println("-------------------------------------------");
        System.out.println(st.count());
        System.out.println("-------------------------------------------");

        System.out.println(st.peek());
        System.out.println("-------------------------------------------");

    }
}
