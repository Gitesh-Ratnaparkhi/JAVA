package Pattern_Printing;
import java.util.Scanner;
public class Numerical_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle ");
        int breadth = sc.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    
    }
}
