// This is an optimised approach time complexity is reduced.
import java.util.Scanner;
public class Bubble_short_Otimised {
// OpTIMISED code of bubble short .
    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }

    static void bubble_short(int array[]){
        int len = array.length;
        for (int i = 0; i < len - 1; i++){
            boolean flag = false;
            for(int j = 0; j < len - i - 1;j++ ){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true ;
                }
            }
            if (flag == false) return ;
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
        bubble_short(array);
        print_arr(array);   
        sc.close(); 
    
    }
    
}
