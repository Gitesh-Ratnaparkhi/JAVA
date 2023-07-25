// In the Given program take input from user and print a right angle triangle.
package Loops;
import java.util.Scanner;
public class Triangular_pattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height od the triangle ");
        int num1=sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
        sc.close();
        
    }
    
}
