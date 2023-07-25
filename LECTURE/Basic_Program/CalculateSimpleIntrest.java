import java.util.Scanner;
public class CalculateSimpleIntrest{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal");
        float principal = sc.nextFloat();
        System.out.println("Enter the Rate of intrest");
        float Rate = sc.nextFloat();
        System.out.println("Enter the time ");
        float time = sc.nextFloat();
        float simple = (principal*Rate*time)/100;
        System.out.println("Principal = "+principal);
        System.out.println("Rate = "+Rate );
        System.out.println("Time = "+time);
        System.out.println("Simple Intrest is = "+simple);
        sc.close();
    } 
}