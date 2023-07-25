package Loops;

import java.util.Scanner;

public class print_sumOF_streamOfInt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = sc.nextInt();
        do{
            sum=sum+num1;
            System.out.println(sum);
            num1 = sc.nextInt();
        }while (num1!=-1);
        sc.close();
    }
    
}
