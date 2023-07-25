package Loops;
import java.util.Scanner;
public class Nmerical_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for creating numberical rectangle");
        int num1=sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num1;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
        System.out.println();
        }
        sc.close();
    }
    
}
