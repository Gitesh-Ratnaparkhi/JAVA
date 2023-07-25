import java.util.Scanner;
public class ArithmaticOprater{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 1 = ");
        int num2 = sc.nextInt();
        int add = num1+num2 ;
        System.out.println("The sum is  = "+add);
        int sub = num1-num2;
        System.out.println("The subtraction is  = "+sub);
        int mul = num1*num2;
        System.out.println("The mutiplication is  = "+mul);
        int div= num1/num2;
        System.out.println("The division is  = "+div);
        int mod = num1%num2;
        System.out.println("The modulus is  = "+mod);
        sc.close();
    }
    
}
