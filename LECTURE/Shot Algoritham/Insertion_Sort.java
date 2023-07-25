import java.util.Scanner;
// The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
public class Insertion_Sort {
    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }

    static void insertion_sort(int array[]){
        int len = array.length;
        for(int i = 1; i<len; i++){
            int j = i;
            while(j > 0 && array[j] < array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the element of the array ");
        for(int i = 0; i < array.length; i++) array[i] = sc.nextInt();
        print_arr(array);
        insertion_sort(array);
        System.out.println("Sorted array is ");
        print_arr(array);
        sc.close();
    }
}
