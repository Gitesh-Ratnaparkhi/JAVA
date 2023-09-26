package Recursion;
import java.util.Scanner;

public class Sum_Of_natural_no {
    static  int series_of_natural_No(int num){
        if(num == 0) return 0;
        return series_of_natural_No(num-1) + num; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number till that you want to find the sum of natural number : ");
        int num = sc.nextInt();
        System.out.println("Sum of n number is : "+series_of_natural_No(num));
        sc.close();
    }
}
