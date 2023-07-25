// The question is that find the total number of pairs in the array whose sum is equal to the given value x.

import java.util.Scanner;
public class pair_Sum {
    static int sum_pairs(int array1[] , int num1){
        int count = 0;
        for(int i=0;i<array1.length;i++){
            for(int j=i+1;j<array1.length;j++){
                if(num1==array1[i]+array1[j]) count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose sum in pairs you have to find");
        int num=sc.nextInt();
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");
        System.out.println("");  
        System.out.println("The number of pairs are "+sum_pairs(array, num));
        sc.close();
    } 
}
