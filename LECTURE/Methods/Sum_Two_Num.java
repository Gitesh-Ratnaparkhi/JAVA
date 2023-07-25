package Methods;
import java.util.Scanner;
public class Sum_Two_Num {
    static int sum_num(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("The sum of two number is : "+sum_num(num1, num2));
        sc.close();
    }
}
