package Loops;

import java.util.Scanner;

public class NumberOfdigitCount {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to find number of digit present inside the number : ");
        int num1=sc.nextInt();
        int sum_digit=0;
        while(num1>0){
           num1=num1/10;
           sum_digit++;
        }
        System.out.println("The number of digits present in the given digit is "+sum_digit);
        sc.close();
    }
    
}
