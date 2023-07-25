package Recursion;
// find the sum of digits given in the number 
import java.util.Scanner;
public class Sum_Number_Rec {
    static int sum_digit_recursion(int number){
        if(number >= 0 && number <= 9) return number; 
        int sum = sum_digit_recursion(number / 10);
        return sum + number % 10; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which sum you have to find ");
        int number = sc.nextInt();
        System.out.println("Sum of the digits in the number is = "+sum_digit_recursion(number));
        sc.close();
    }
}
