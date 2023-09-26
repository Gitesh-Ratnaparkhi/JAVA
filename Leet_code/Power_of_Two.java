// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

// Example
// Input: n = 16
// Output: true
// Explanation: 24 = 16


import java.util.Scanner;
public class Power_of_Two{
    public static boolean isPowerOfTwo(int n) {
        boolean res = true;

        if(n==1) return res;
        if(n%2==0){
            n=n/2;
        } 
        else return !res;
        int rev =1;
        while(rev<=n){
            if(rev == n){
                return res;
            }
            rev*=2;
        }
        return !res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check : ");
        int num = sc.nextInt();
        System.out.println(isPowerOfTwo(num));
        sc.close();
    }
}

// if we given number as 16
// first we will check entered number is 1 or not 
// if entered number is 1 we will return true 
// condition 2 if(n%2==0) n=n/2; if num is is even then we will divide num by 2 to reduce the time complexity
// else we will return false because power of two is always even so if we get odd number so we will return false
// now we will run a loop from rev = 1 to n/2
// and we will check is rev == n ? if yes then return true er get the power 
// if we not get then we will increase rev by *2 
// and till end of the loop if we not get pow the we will return false 

// The main concept if the entered number is power then half of that number must be the power of tha t number.
// example -> num = 16
// num/2 = 8
// 2*2*2 = num/2
// there fore 16 comes in the power of 2 