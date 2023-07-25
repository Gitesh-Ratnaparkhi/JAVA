package Pattern_Printing;
import java.util.Scanner;
public class RightAngle_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle : ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
