package Number_System;
import java.util.Scanner;
public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number : ");
        int decimal_num = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while(decimal_num>0){
            int parity = decimal_num%2;
            ans+=parity*pw;
            pw*=10;
            decimal_num/=2;
        }
        System.out.println(ans);
        sc.close();
    }
}


// If we given input as 5 we know the binary of 5 is 101 but how the given code will decimal convert it into binary lets see.
// Now we have given input here we will start while loop at line 12 we will check the given condition if condition satistfy we will return .
// itration 1  --> parity = 1
//                 ans = 1
//                 pw = 10
//                 decimal_num = 2 

// itration 2  --> parity = 0
//                 ans = 1
//                 pw = 100
//                 decimal_num = 1 

// itration 3  --> parity = 0
//                 ans = 101  { ans = 1 + 100 }
//                 pw = 1000
//                 decimal_num = 0 


