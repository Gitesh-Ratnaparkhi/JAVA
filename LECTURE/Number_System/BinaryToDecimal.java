package Number_System;
import java.util.Scanner;

// This code convert binary number to decimal number 
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int binary_num = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while(binary_num>0){
            int unit_digit = binary_num%10;
            ans+=(unit_digit*pw);
            binary_num/=10;
            pw*=2;
        }
        System.out.println(ans);
        sc.close();
    }
}
// If we given input as 101 we know the decimal of 101 is 5 but how the given code will convert it into decimal lets see.
// Now we have given input here we will start while loop at line 12 we will check the given condition if condition satistfy we will return .
// itration 1  --> untidigit = 1 
//                 ans = 1
//                 binary _num = 10 
//                 pw = 2

// itration 2  --> untidigit = 0
//                 ans = 1
//                 binary _num = 1 
//                 pw = 4

// itration 3  --> untidigit = 1
//                 ans = 5   { ans = 1 + 4 }
//                 binary _num = 0 
//                 pw = 8
