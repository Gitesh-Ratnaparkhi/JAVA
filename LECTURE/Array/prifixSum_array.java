// Given an integer array a return the prefix sum / unning sum in different array. 
import java.util.Scanner;
public class prifixSum_array {
    static void print_arr(int array[]){
        for(int j = 0 ;j<array.length ; j++) System.out.print(array[j]+" ");
        System.out.println("  ");
    }
    static int[]  prifixsum_array(int array[]){
        int len = array.length ;
        int ans [] = new int [len];
        ans[0] = array[0];
        for(int i = 1; i < len ; i++){
            ans[i] = ans[i-1] + array[i];
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int [size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<=array.length-1;i++) array[i]=sc.nextInt();
        print_arr(array);  
        prifixsum_array(array);
        print_arr(prifixsum_array(array));  
        sc.close();
    }
}
