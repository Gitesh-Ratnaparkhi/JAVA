package Conditional;

import java.util.Scanner;

public class EvenDivisibleBy3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if(num%2==0 && num%3==0) System.out.println(" The answer is = "+num);
        else System.out.println(" The answer is not a answer = "+num);
        sc.close();
    }

}