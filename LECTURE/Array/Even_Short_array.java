// Given array of integer a move all the even integer at the beginnig of the array followed by all the add integers. The relative order of odd or even integers does not matter .Return any array that satistfies the condition.
import java.util.Scanner;
public class Even_Short_array {

    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }

    static void Swap(int array[] , int i , int j){
        int temp = array[i] ;
        array[i] = array[j];
        array[j] = temp ;
    }

    static void parity_array_sorting(int array1[]){
        int len = array1.length ;
        int left = 0 ;
        int right = len - 1;
        while(left<right){
            if(array1[left] % 2 == 1 && array1[right] % 2 == 0){
                Swap(array1, left , right);
                left++;
                right--;
            }
            if(array1[left]%2==0) left++;
            if(array1[right]%2!=0) right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array1[] = new int [size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<=array1.length-1;i++) array1[i]=sc.nextInt();
        print_arr(array1);   
        parity_array_sorting(array1);
        print_arr(array1);   
        sc.close();
    }
}
