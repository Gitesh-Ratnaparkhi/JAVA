import java.util.Scanner;
public class Counting_Bits_QueNo_338 {
    public static int pow(int num1 , int num2 ){
        for(int i = 1; i < num2 ; i++){
            num1*=num1;
        }
        return num1;
    }
    public static int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int evenCount = 1;
        int oddCount = 1;
        int index = 0;
        for(int i = 2 ; i <= n ;i++){
            int CopyIdx = 0;
            if(i % 2 == 0){
                index = pow(10 ,evenCount);
                evenCount++;
                CopyIdx = index;
            } 
            else {
                oddCount = oddCount*10+1;
                CopyIdx = oddCount;
            }
            System.out.println(CopyIdx +" "+ i);
            int check = 0;
            int count = 0;
            while(CopyIdx > 0){
                check = CopyIdx % 10;
                if(check == 1)count++;
                CopyIdx/=10;
            }
            arr[i] = count;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int array [] = new int[n+1];
        array = countBits(n);
        for(int i = 0; i<= n ;i++){
            System.out.print(array[i]+" ");
        }
       sc.close();
    }
}
