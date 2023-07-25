package Pattern_Printing;
import java.util.Scanner;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle ");
        int breadth = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth ; j++) {
                if(i == 1 || j == 1 || i == length || j == breadth)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
        sc.close();        
    }
}
