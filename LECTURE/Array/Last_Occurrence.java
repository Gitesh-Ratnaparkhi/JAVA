
import java.util.Scanner;
public class Last_Occurrence {
    static int last_occurrence(int arr[],int num){
        int count=-1;
        for(int i=0;i<arr.length;i++) if(arr[1]==num) count=1;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which you have to find");
        int num1=sc.nextInt();
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of the arrray ");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.println(array[j]);
        System.out.println("This will give 1 if the element is present in array otherwise -1 and the answer is "+last_occurrence(array, num1));
        sc.close();
    }
}
// Fint the last occurrence of the given element in the array
