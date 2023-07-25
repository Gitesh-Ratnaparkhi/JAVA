// Question count the number of element strictly greater than the given value x.
import java.util.Scanner;
public class Greter_Than_Num {
    static int greater_num(int arr[],int num){
        int count = 0;
        for(int i=0;i<arr.length;i++) if(num<=arr[i]) count+=1;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element from which number of greater elements you have to find ");
        int num1=sc.nextInt();
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");
        System.out.println("");
        System.out.println("The number of elements are greater than and equal to that are "+greater_num(array, num1));
        sc.close();
    }
}
