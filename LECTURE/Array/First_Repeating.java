// Given an array consiting of intigers Return the first value what is repeated in this array If no value is being repeated return -1.
import java.util.Scanner;
public class First_Repeating {
    static int First_repeating(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) return arr[i];
            }
        }

        return -1;
    }  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int num1 = sc .nextInt();
        int array[] = new int [num1];
        System.out.println("Enter the elements of the arrray ");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");     
        System.out.println();     
        System.out.print("If the first value is repeated then It will print that repeated value other wise -1 "+First_repeating(array));    
        sc.close();
    }
}