import java.util.Scanner;

public class AssigmentOprater {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 1 = ");
        int num2 = sc.nextInt();
        int num3=num2;
        System.out.println("use of = oprater "+num3);
        num1+=num2;
        System.out.println("use of += oprater "+num1);
        num1-=num2;
        System.out.println("use of -= oprater "+num1);
        num1*=num2;
        System.out.println("use of *= oprater "+num1);
        num1%=num2;
        System.out.println("use of %= oprater "+num1);
        num1/=num2;
        System.out.println("use of /= oprater "+num1);
        sc.close();
    }
}
