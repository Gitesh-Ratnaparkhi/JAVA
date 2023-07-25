package Loops;

import java.util.Scanner;

public class SumOfNoInNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to which you want to find the sum ");
        int num1=sc.nextInt();
        int id_num=0;
        int sum=0;
        for(int i=num1;i>0;i++){
            id_num=num1%10;
            sum=sum+id_num;
            num1=num1/10;
        }
        System.out.println("The sum of the number is "+sum);
        sc.close();
    }    
}
