package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1= sc.nextInt();
        if(num1==0) System.out.println("The reverse of the number is 0");
        else if(num1>0){
            for(int i=num1 ; i>=0 ; i--){
                System.out.println(i);
            }
        }
        else if(num1<0){
            for(int i=num1;i<=0;i--){
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
