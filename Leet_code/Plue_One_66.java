// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

import java.util.Scanner;

public class Plue_One_66{
    public static int[] plusOne(int[] digits) {
        int value = 0;
        int res = 0;
        for(int i = 0; i < digits.length ; i++){
            if(i == 0)res = digits[i];
            value=(value*10)+digits[i];
        }
        int len = digits.length;
        if(value % 10 == 9 && res == 9)len+=1;
        value += 1;
        int arr[] = new int[len];
        for(int i = arr.length-1; i >= 0 ; i--){
            arr[i] = value % 10;
            value/=10;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int array [] = new int[n+1];
        array = plusOne(array);
        for(int i = 0; i<= n ;i++){
            System.out.print(array[i]+" ");
        }
       sc.close();
    }
}