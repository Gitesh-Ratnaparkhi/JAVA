package Loops;

import java.util.Scanner;

public class Revrse_digit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to reverse the given digit ");
        int num1=sc.nextInt();
        int mod=0;
        int rev_no=0;
        while(num1>0){
            mod=num1%10;
            rev_no=(rev_no*10)+ mod;
            num1=num1/10;
        }
        System.out.println("The reverse number is "+rev_no);
        sc.close();
    }   
}
