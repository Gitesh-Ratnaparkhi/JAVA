package Loops;

import java.util.Scanner;

public class Calculate_power {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number whose ower you have to calculate ");
            int num1=sc.nextInt();
            System.out.println("Enter the power ");
            int num2=sc.nextInt();
            int pow=1;
            int i =1;
            while(i<=num2){
                pow*=num1;
                i++;
            }
            System.out.println("The power of the entered number is = "+pow);
        }
    }
    
}
