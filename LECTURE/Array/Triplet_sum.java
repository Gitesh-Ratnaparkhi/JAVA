// Find the number of triplets whose sum is equal to given value x.

import java.util.Scanner;
public class Triplet_sum {
    static int triplets_sum(int arr[] , int target){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(target==arr[i]+arr[j]+arr[k]) sum++;
                
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose sum you have to find");
        int num1 = sc.nextInt();
        System.out.println("Enter the size of the the array ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int i=0;i<array.length;i++) System.out.println(array[i]+" ");
        System.out.println("Number of pairs are "+triplets_sum(array, num1));
        sc.close();
    }  
}
