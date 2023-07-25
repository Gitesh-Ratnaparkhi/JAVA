// Check if the given array is sorted or not.
import java.util.Scanner;
public class Sorted_Array_or_not {
    static boolean is_Sorted(int arr[]){
        boolean check = true;
        for(int i=1;i<arr.length;i++) if(arr[i]<arr[i-1]) check=false;
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");
        System.out.println("");
        System.out.println("Is sorted "+is_Sorted(array));
        sc.close();
    }   
}