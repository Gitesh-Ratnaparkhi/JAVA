// given two integer a and b Swapthe given values using sum and difference methods.
import java.util.Scanner;
public class Swap2 {
    static void swap(int n1 , int n2){
        System.out.println("The number before swaping is "+n1);
        System.out.println("The number before swaping is "+n2);
        n1=n1+n2; // 10+100=110
        n2=n1-n2; // 110-100=10
        n1=n1-n2; // 110-10=100
        System.out.println("The number after swaping is "+n1);
        System.out.println("The number after swaping is "+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber 1 to swap ");
        int num1 = sc.nextInt();
        System.out.println("Enter the nuber 2 to swap ");
        int num2 = sc.nextInt();
        swap(num1, num2);
        sc.close();
    }   
}
