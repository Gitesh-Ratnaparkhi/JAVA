package Pattern_Printing;
import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size ; j++) {
                if(i == j || j+i == size+1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
        sc.close();
    
    }
}
