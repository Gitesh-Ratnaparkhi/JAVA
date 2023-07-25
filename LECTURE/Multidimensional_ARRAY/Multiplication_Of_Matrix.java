package Multidimensional_ARRAY;
// Multiplication of 2 matrix
import java.util.Scanner;
public class Multiplication_Of_Matrix {

    // This is the first method to print an array .
    static void print_array(int array[][]){
        for(int i = 0 ;i < array.length ; i++){
            for(int j = 0; j < array[i].length ;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Method to multiply two matrix
    // Note for Multiplication row of first matrix must be equal to columns of second matrix .
    static void matrix_Multiplication(int array1[][] , int array2[][] , int row1 ,int colums1 , int row2 , int colums2){
        if(row1 != colums2){
            System.out.println("Wrong dimension Multiplication is not possible ");
            return ;
        }
        int result[][] = new int[row1][colums2];
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < colums2; j++){
                for(int k  = 0; k < colums1 ; k++){
                    result[i][j] += (array1[i][k] * array2[k][j]);
                }
            }
        }
        System.out.println("The Multiplication oif two matrix is ");
        print_array(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This is the first Matrix .
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

 
        // This is my second MATRIX
        System.out.println("Enter the number of rows of the 2nd array rows : ");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of the 2nd array colums : ");
        int colums2 = sc.nextInt();
        int array2[][] =new int[row][colums];
        System.out.println("Enter the elements of the 2nd array ");
        for(int i = 0; i < row ;i++){
            for(int j = 0; j < colums; j++){
                array2[i][j] = sc.nextInt();
            }
        }
        print_array(array1);

        // Calling the function matrix_Multiplication
        matrix_Multiplication(array1, array2, row, colums, row2, colums2);
        sc.close();
    }
}