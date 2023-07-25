import java.util.Scanner;
public class Using_Scanner{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The enter number is "+number);
        sc.close();
    }
}
// use nextInt() for integer input
// use nextFloat() for float input
// use nextBoolean() for Boolean input
// use nextLine() for String input
// use next() for String input
// use nextByte() for BYTE input
// use nextDouble() for double variable input
// use nextShort() for short variable input
// use nextLong() for long variable input