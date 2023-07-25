// Short the array consisting of only zero and one .
import java.util.Scanner;
public class Sort_Array_of_0and1 {

    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
    }

    static void sort_arr_0_And_1(int array1[]){
        int zero = 0;
        int length = array1.length;
        for(int i = 0; i < array1.length ; i++) if(array1[i]== 0) zero ++;
        for(int j = 0; j<length ; j++){
            if(j<zero) array1[j] = 0; 
            else array1[j] = 1;
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array1[] = new int [size];
        System.out.println("Enter the elements of the array NOTE Enter only 0 and 1");
        for(int i=0;i<=array1.length-1;i++) array1[i]=sc.nextInt();
        print_arr(array1);   
        System.out.println("  ");
        sort_arr_0_And_1(array1);
        print_arr(array1);   
        sc.close();


    }
    
}
