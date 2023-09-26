package Recursion;
import java.util.Scanner;

public class Greatest_commonDivisor {
    static int common_dif(int num1 ,int num2){
        while(num1%num2 == 0){
            int rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The common difference is : "+common_dif(num1 , num2));
        sc.close();
    }
}
