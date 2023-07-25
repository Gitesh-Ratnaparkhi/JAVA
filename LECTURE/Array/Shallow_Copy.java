import java.util.Scanner;
public class Shallow_Copy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num1=sc.nextInt();
        int array1[]=new int[num1];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<=array1.length-1;i++) array1[i]=sc.nextInt();
        for(int i=0;i<=array1.length-1;i++) System.out.print(array1[i]+" ");
        System.out.println("  ");
        int array2[]=array1;
        for(int i=0;i<=array2.length-1;i++) System.out.print(array2[i]+" ");
        sc.close();
    }
}
// Note this which we have created the copy os shallow copy this copy is present in same memory location as origional array .
// any change in old copy will affect on new copy also.
//Whenever we use default implementation of clone method we get shallow copy of object means it creates new instance and copies all the field of object to that new instance and returns it as object type, we need to explicitly cast it back to our original object. This is shallow copy of the object.

