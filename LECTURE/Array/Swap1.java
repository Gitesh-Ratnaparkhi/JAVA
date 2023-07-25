
//Given two variable a and b swap the 2 given value using temporary variable.
import java.util.Scanner;

public class Swap1 {
    static void Swaping(int num1 , int num2){
        System.out.println("The entered number 1 is before swaping "+num1);
        System.out.println("The entered number 2 is before swaping "+num2);
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("The entered number 1 is after swaping is "+num1);
        System.out.println("The entered number 2 is after swaping is "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to swap");
        int numb1 = sc.nextInt();
        System.out.println("Enter the number 2 which you want to swap");
        int numb2 = sc.nextInt();
        Swaping(numb1, numb2);
        sc.close();
    }
}
