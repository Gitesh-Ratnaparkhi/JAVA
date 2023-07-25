package Loops;

import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1 ");
        int num1 = sc.nextInt();
        int sum=0;
        if(num1==0) System.out.println("The sum is zero ");
        else if(num1>0){
            for(int i=0;i<=num1;i++){
                sum+=i;
            }
            System.out.println("The sum of n number is = "+sum);
        }
        else if(num1<0){
            for(int i=0;i<=num1;i--){
                sum+=i;
            }
            System.out.println("The sum of n number is = "+sum);
        }    
        sc.close();
    }
    
}
