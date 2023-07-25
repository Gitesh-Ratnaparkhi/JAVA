package Loops;

import java.util.Scanner;

public class PrintNnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting number from which you have to print number ");
    int num1=sc.nextInt();
    System.out.println("Enter the Ending number from which you have to print number ");
    int num2=sc.nextInt();
    if(num1==num2)System.out.println(num1);
    else if(num1<num2){
        while(num1<=num2){
            System.out.println(num1);
            num1++;
        }
    }
    else if(num1>num2){
        while(num1>=num2){
            System.out.println(num1);
            num1--;
        }
    }
    sc.close();
  }
}
