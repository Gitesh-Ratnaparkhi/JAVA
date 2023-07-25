package Recursion;
import java.util.Scanner;
public class Fibonacci_Series {
    static int fibonacci_series(int number){
        if(number == 0|| number == 1 )return number ;
        int prive = fibonacci_series(number - 1);      // 6 5 4 3 2 1 
        int prev_prev = fibonacci_series(number - 2);  // 6 4 2 0 
        return prive + prev_prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you hae to find the series = ");
        int num1 = sc.nextInt();
        System.out.println("Fibonacii series of the given number is that "+ fibonacci_series(num1));
        sc.close();
    }
}
