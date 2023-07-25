// The question is that we have to print the sum of number which are not dividible by 2. 
package Loops;
import java.util.Scanner;
public class SumOfSeriesNotDivBy2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number uptil which you have to find the sum ");
        int num1=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num1;i++){
            if(i%2!=0) sum+=1;
        }
        System.out.println("The sum of number which are not divisible by 2 is = "+sum);
        sc.close();
    }    
}
