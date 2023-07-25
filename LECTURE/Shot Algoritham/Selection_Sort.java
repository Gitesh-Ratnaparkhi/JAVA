import java.util.Scanner;
// You need to select the smallest element in the array and move it to the beginning of the array by swapping with the front element.
public class Selection_Sort {

    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }

    static void selection_sort (int array[]){
        if(array.length == 0) return ;
        for (int i = 0; i < array.length - 1;i++){ // note i represent current index 
            int min_index = i ;
            for(int j = i + 1;j < array.length; j++){
                if(array[j] < array[min_index]) min_index = j;
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
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
        selection_sort(array);
        print_arr(array);
        sc.close();

    }
}
