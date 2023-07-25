package Loops;

import java.util.Scanner;

public class SumOfStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num1 = sc.nextInt();
        int sum = 0;
        while(num1!=-1){
            sum+=num1;
            num1=sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
    
}
