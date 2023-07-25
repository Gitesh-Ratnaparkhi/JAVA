import java.util.Scanner;
public class Deep_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int num1=sc.nextInt();
        int array1[]=new int[num1];
        System.out.println("Enter the size of the array");
        for(int i=0;i<=array1.length-1;i++) array1[i]=sc.nextInt();
        for(int i=0;i<=array1.length-1;i++) System.out.print(array1[i]+" ");
        System.out.println(" ");
        int array2[]=new int[num1];
        array2=array1.clone();
        for(int j=0;j<=array2.length-1;j++) System.out.print(array2[j]+" ");
        sc.close();
    }
}
// clone() method of the object class support shallow copy of the object. If the object contains primitive as well as non primitive or reference type variable in shallow copy, the cloned object also refers to the same object to which the original object refers as only the object references gets copied and not the referred objects themselves.

