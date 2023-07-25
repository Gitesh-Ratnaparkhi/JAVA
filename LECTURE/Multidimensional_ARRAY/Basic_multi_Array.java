package Multidimensional_ARRAY;
// Create a basic 2 dimensional array .
import java.util.Scanner;

public class Basic_multi_Array {
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
        int array[][] = {{1 ,2 ,3 , 4},
                         {5 ,6 ,7 ,8,},
                         {10 ,11 ,12 ,13}};
        print_array(array);
        sc.close();
    }
}
