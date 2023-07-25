package Loops;
import java.util.Scanner;
public class Reverse_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of triangle");
        int num1=sc.nextInt();
        for(int i=0;i<=num1;i++){
            for(int j=1;j<=num1-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }    
        sc.close();
    }
    
}
