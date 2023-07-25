// Question is that find the factorial of the number which is entered by the user 
package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose FACTORIAL you have to find ");
        int num1=sc.nextInt();
        int factorial=1;
        while(num1!=0){
        factorial=factorial*num1;
        num1--;
        }
        System.out.println("The factorial of the given number is = "+factorial);
        sc.close();
    }
}
