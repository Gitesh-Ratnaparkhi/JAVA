package Pattern_Printing;
import java.util.Scanner;
public class OneTwo_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle ");
        int breadth = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth ; j++) {
                if((i+j)%2 == 0) System.out.print(1);
                else System.out.print(2);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
