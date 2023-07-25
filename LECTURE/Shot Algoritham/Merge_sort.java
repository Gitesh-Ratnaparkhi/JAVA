import java.util.Scanner;
    public class Merge_sort{

    // This function is used to peint the array
    public static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }

    // this function will merge sorted array 
    public static void merge(int arr[] , int left ,int mid ,int right){
        int n1=mid-left+1;
        int n2 = right-mid;
        int [] larr = new int[n1];
        int [] rarr = new int[n2];
        int i,j,k;
        for(i =0;i<n1;i++) larr[i] = arr[left+i];
        for(j =0;j<n2;j++) rarr[j] = arr[mid+1+j];
        i = 0;
        j =0;
        k = left;
        while(i<n1 && j< n2){
            if(larr[i] < rarr[j]) arr[k++]= larr[i++];
            else arr[k++] = rarr[j++];
        }
        while(i < n1) arr[k++] = larr[i++];
        while(j<n2) arr[k++] = rarr[j++];
    }

    // this function will sort all the array according to the given array 
    public static void merge_sort(int arr[], int left , int right) {
        if(left>=right)return ;
        int mid = (left+right)/2;
        merge_sort(arr,left, mid);
        merge_sort(arr, mid+1, right);
        merge(arr,left,mid,right);
    }

    // main function start from here 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int array [] = new int[size];
        
        // Taking input in an array 
        System.out.println("Enter the element od the array : ");
        for(int i = 0; i<array.length;i++) array[i] = sc.nextInt();
        print_arr(array);

        // function calling 
        merge_sort(array , 0 , array.length-1);
        print_arr(array);
        sc.close();
    }
}


//Merge sort is defined as a sorting algorithm that works by dividing an array into smaller subarrays, sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.
// Workhing of merge sort
// Merge sort is a recursive algorithm that continuously splits the array in half until it cannot be further divided i.e., the array has only one element left (an array with one element is always sorted). Then the sorted subarrays are merged into one sorted array.
// Time complexity of merge sort is O(n log n)
// Space complexity of merge sort is O(n + logn)