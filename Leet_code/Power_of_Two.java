
import java.util.Scanner;
public class Power_of_Two{
    public static boolean isPowerOfTwo(int n) {
        boolean res = true;
        if(n==1) return res;
        if(n%2==0) n=n/2;
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