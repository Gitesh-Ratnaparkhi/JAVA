package Multidimensional_ARRAY;
import java.util.Scanner;
public class Transpose_Inplace {
// Note here Transpose means colums will get converted into rows .
// Write a program to displav traspose a matrix enteed by the user.

    static void print_array(int array[][]){
        for(int i = 0 ;i < array.length ; i++){
            for(int j = 0; j < array[i].length ;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Transpose_matrix(int matrix[][] , int rows , int columns){
        for(int i=0 ; i<columns ; i++){
            for(int j = 0; j< rows ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }        
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the array : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of the colums : ");
        int colums = sc.nextInt();
        int array1[][] =new int[row][colums];
        System.out.println("Enter the elements of the array ");
        for(int i = 0; i < row ;i++){
            for(int j = 0; j < colums; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        print_array(array1);
        System.out.println("Transpose matris is : ");
        Transpose_matrix(array1, row, colums);
        print_array(array1);
        sc.close();

    }
}
