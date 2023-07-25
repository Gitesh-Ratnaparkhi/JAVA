package Loops;
import java.util.Scanner;
public class Hollow_rectangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the breadth of the rectangle ");
        int num1=sc.nextInt();
        System.out.println("Enter the length of the rectangle ");
        int num2=sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num2;j++){
                if(i==1||j==1||i==num1||j==num2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        } 
        sc.close();
    }
}
