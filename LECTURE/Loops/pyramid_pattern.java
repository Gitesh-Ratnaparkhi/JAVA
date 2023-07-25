package Loops;
import java.util.Scanner;
public class pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for printing a pyramid ");
        int num1=sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}