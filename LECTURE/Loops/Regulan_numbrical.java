package Loops;
import java.util.Scanner;
public class Regulan_numbrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1 = sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
