package Recursion;
import java.util.Scanner;
// fint the factorial of the given number 
public class Factorial{
    static int factorial(int number){
        // base case 
        if(number ==0) return 1;
        int small_ans = factorial(number-1);
        int ans = number*small_ans;
        return ans;
    }

    // same program but optimised approach 
    static int factorial_one(int number){
        if(number==0) return 1;
        return number*factorial_one(number - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you have to find the factoril : ");
        int number = sc.nextInt();
        System.out.println("Factorial of the given number is = "+factorial(number));
        System.out.println("Factorial of the given number is = "+factorial_one(number));
        sc.close();
    }
}