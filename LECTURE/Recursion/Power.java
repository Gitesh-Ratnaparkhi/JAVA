package Recursion;
import java.util.Scanner;
public class Power {
    static int power(int p , int q){
        if(q == 0)return 1;
        return power(p , q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the power : ");
        int num2 = sc.nextInt();
        System.out.println("The power of the given number is : "+power(num1, num2));
        sc.close();
    }
}
