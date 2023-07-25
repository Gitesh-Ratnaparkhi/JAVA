import java.util.Scanner;
public class USe_Of_Max_Func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("The max Number is : "+Math.max(num1 , num2));
        // The Java.lang.math.max() function is an inbuilt function in Java which returns maximum of two numbers.
        
        System.out.println("The min Number is : "+Math.min(num1 , num2));
        // The Java.lang.math.min() function is an inbuilt function in java that returns the minimum of two numbers. 
        sc.close();
    }
}
