package Multidimensional_ARRAY;
// Given an number matrix 'a' return all elements of the matrix in spiral order
import java.util.Scanner;
public class Spiral_Matrix {

    // Method to print array ;
  static void print_array(int array[][]){
        for(int i = 0 ;i < array.length ; i++){
            for(int j = 0; j < array[i].length ;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    // method to spiral element
    static void spial_matrix(int array[][],int row , int columns){
        int top_row = 0 ;
        int bottom_row = row-1;
        int left_col = 0;
        int right_col = columns-1;
        int total_ele = 0;
        while(total_ele < row*columns){

            // for top row --> left to right columns 
            for(int i=left_col; i<=right_col && total_ele < row*columns; i++){
                System.out.print(array[top_row][i]+" ");
                total_ele++;
            }
            top_row++;

            // for right column --> top row to bottom row 
            for(int i=top_row ; i<= bottom_row && total_ele < row*columns ; i++){
                System.out.print(array[i][right_col]+" ");
                total_ele++;
            } 
            right_col--;

            // for bottom row --> right to left columns
            for(int i = right_col; i>=left_col && total_ele < row*columns ;i--){
                System.out.print(array[bottom_row][i]+ " ");
                total_ele++;
            }
            bottom_row--;
            
            // for left --> bottom row to top row 
            for(int i = bottom_row ; i>=top_row && total_ele < row*columns ; i--){
                System.out.print(array[i][left_col]+ " ");
                total_ele++;
            }
            left_col++;
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
        spial_matrix(array1, row, colums);
        sc.close();
    }    
}
