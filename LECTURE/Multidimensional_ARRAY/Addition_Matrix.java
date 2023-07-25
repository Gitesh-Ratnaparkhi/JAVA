package Multidimensional_ARRAY;
// Note for addition dimensins of the matrix should be same .
import java.util.Scanner;
public class Addition_Matrix {

    // This is the first method to print an array .
    static void print_array(int array[][]){
        for(int i = 0 ;i < array.length ; i++){
            for(int j = 0; j < array.length ;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    // This is the second method to perform addition of matrix
    static void matrix_Addition(int array1[][] , int array2[][] , int row1 ,int colums1 , int row2 , int colums2){
        if(row1 != row2 && colums1 != colums2) {
            System.out.println("Number of rows and columns of both the matrix mubet be equal other wise addition is not ");
            return;
        }
        int answer[][] = new int[row1][colums1];
        for(int i = 0 ; i < row1; i++){
            for(int j = 0 ;j < colums1 ;j++ ){
                answer[i][j] = array1[i][j] + array2[i][j];
            }
        }
        print_array(answer);
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
        print_array(array2);
        System.out.println(" ");
        matrix_Addition(array1, array2, row, colums, row2, colums2);
        sc.close();
    }    
}
