import java.util.Scanner;
public class Cal_Length_ARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");
        System.out.println("");
        System.out.println("The length of the array is "+array.length);
        sc.close();
    }
}
