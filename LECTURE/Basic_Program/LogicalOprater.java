import java.util.Scanner;

public class LogicalOprater {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num1=sc.nextInt();
        System.out.println("Enter the number = ");
        int num2=sc.nextInt();
        System.out.println("Enter the number = ");
        int num3=sc.nextInt();
        System.out.println(!(num1==num2));
        System.out.println((num1>num2) && (num1>num3));
        System.out.println((num1>num2) && (num1<num3));
        System.out.println((num1>num2) || (num1>num3));// if num1 = 50 and num2= 45
        System.out.println((num1>num2) || (num1<num3));
        System.out.println(!(num1<=num2));
        sc.close();
    }
    
}
