// Short the array consisting of only zero and one Approach 2 
import java.util.Scanner;
public class Sort_array_Approach2 {

    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
    }

    static void swap(int array1[] , int i , int j){
        int temp = array1[i];
        array1[i] = array1[j];
        array1[j] = temp;
    }

    static void sort_arr_0_And_1(int array1[]) {
        int left  = 0;
        int right = array1.length-1;
        while(left<right){
            if(array1[left]==1 && array1[right]==0 ){
                swap(array1, left, right);
                left++;
                right++;
            }
            if(array1[left]==0) left++;
            if(array1[right]==1) right--;
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
