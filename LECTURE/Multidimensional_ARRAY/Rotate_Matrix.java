package Multidimensional_ARRAY;
import java.util.Scanner;
// given an square matrix turn it by 90 degree in a clockwise direction without ising any extra space .
public class Rotate_Matrix {

    // method to print an array 
    static void print_array(int array[][]){
        for(int i = 0 ;i < array.length ; i++){
            for(int j = 0; j < array[i].length ;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    //method to transpose an array 
    static void Transpose_matrix(int matrix[][] , int rows , int columns){
        int ans_matrix[][] = new int [columns][rows];
        for(int i=0 ; i<columns ; i++){
            for(int j = 0; j< rows ; j++){
                ans_matrix[i][j] = matrix[j][i];
            }        
        }
    }

    // method to reverse an array
    static void Reverse_array(int array[]){
        int left= 0;
        int right = array.length - 1;
        while(left < right){
            int temp = array[left];
            array[left]= array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Method to rotate an matrix
    static void rotate_matrix(int array[][] , int num){
        Transpose_matrix(array, num, num);
        for(int i = 0;i<num ; i++) Reverse_array(array[i]);
    }

    // In this program first we will conver columns into rows and rows into columns and then we will reverse rows
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array : ");
        int row = sc.nextInt();
         int array1[][] =new int[row][row];
        System.out.println("Enter the elements of the array ");
        for(int i = 0; i < row ;i++){
            for(int j = 0; j < row; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        print_array(array1);
        rotate_matrix(array1, row);
        System.out.println("Rotated matrix is ");
        print_array(array1);
        sc.close();
   }
}
