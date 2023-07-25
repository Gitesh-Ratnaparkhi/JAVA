package Conditional;

import java.util.Scanner;

public class DivisibleBy3and5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be tested = ");
        int num1 = sc.nextInt();
        if(num1%5==0 && num1%3==0) System.out.println("The answer number is divisile by 3 and 5 = "+num1);
        else System.out.println(" The number is not divisible by 5 and 3");
        sc.close();
    }
}
