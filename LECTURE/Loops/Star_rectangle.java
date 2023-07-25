// Write a program to print rectangle using a star.
package Loops;
import java.util.Scanner;
public class Star_rectangle {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the second number 2");
        int num2=sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num2;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
