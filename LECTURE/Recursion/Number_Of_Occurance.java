package Recursion;

// Given a number and a value k Pint k miltiple of number .
import java.util.Scanner;
public class Number_Of_Occurance {
    static void printMultiple(int n , int k){
        if(k==1){
            System.out.println(n);
            return ;
        }
        printMultiple(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiple you have to find : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of time you have to find the multiple : ");
        int k = sc.nextInt();
        printMultiple(n, k);
        sc.close();
    }
}
