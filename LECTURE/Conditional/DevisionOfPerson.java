package Conditional;

import java.util.Scanner;

public class DevisionOfPerson{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        if(age<=0) System.out.println("Enter the valid age ");
        else if(age<12) System.out.println("You are a child "+age);
        else if(age>12 || age<18) System.out.println("You are a Teenager "+age);
        else if(age>18) System.out.println("You are a Adult "+age);    
        sc.close();
    }

}