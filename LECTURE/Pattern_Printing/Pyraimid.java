package Pattern_Printing;
import java.util.Scanner;
public class Pyraimid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle : ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }

}
