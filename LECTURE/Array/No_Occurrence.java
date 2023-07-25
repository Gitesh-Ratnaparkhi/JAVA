import java.util.Scanner;
public class No_Occurrence {
    static int count_occurance(int arr[],int num1){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num1) count+=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you have to find in array");
        int number=sc.nextInt();
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[]=new int [size];
        System.out.println("Enter the size of the array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++) System.out.println(array);
    System.out.println("Number of occurance of given number is "+count_occurance(array, number));
    sc.close();
    } 
}
