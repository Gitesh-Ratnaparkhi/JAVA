package Multidimensional_ARRAY;
// Take input in multidimensional array 
import java.util.Scanner;

public class Input_multi_Array {
    // this is the method to print the array .
    static void print_array(int array[][]){
        for(int i = 0 ;i < array.length ; i++){
            for(int j = 0; j < array.length ;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the array : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of the colums : ");
        int colums = sc.nextInt();
        int array[][] =new int[row][colums];
        System.out.println("Enter the elements of the array ");
        for(int i = 0; i < row ;i++){
            for(int j = 0; j < colums; j++){
                array[i][j] = sc.nextInt();
            }
        }
        print_array(array);
        sc.close();
    }
}
