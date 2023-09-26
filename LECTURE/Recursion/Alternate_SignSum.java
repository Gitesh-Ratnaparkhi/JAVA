package Recursion;

// Given a number n find the sum of natural number till n but with alternate signs 
import java.util.Scanner;

public class Alternate_SignSum {
    static int Alternate_sum(int num){
        if(num==0)return 0;
        if(num %2 == 0)return Alternate_sum( num - 1)- num;
        else return Alternate_sum(num - 1)+num;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number till that you have to find the sum : ");
        int num = sc.nextInt();
        System.out.println("Thesum of alternate is : "+Alternate_sum(num));
        sc.close();
    }
}
