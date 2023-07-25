import java.util.Scanner;
// Move all the zeroes at the end of the array and move all the elements at the starting of the ARRAY Note the order of the element should not changed.
public class Move_Zeroes {
    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }
    static void move_at_end(int arr[]){
        int len = arr.length;
        for(int i = 0; i<len-1 ;i++){
            for(int j = 0;j<len-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        move_at_end(array);
        print_arr(array);
        sc.close();
    }
}

