package Loops;
import java.util.Scanner;
public class Do_While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num1=sc.nextInt();
        do{

            System.out.println(num1);
            num1++;
        }while(num1<=100);
        sc.close();
    }
}
    

