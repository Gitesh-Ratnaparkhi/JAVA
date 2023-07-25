// give an integer array a sorted in decremented order return an array of the square of each number sorted in non decreasing order .
import java.util.Scanner;
public class Non_decreasing_Sort_array {

    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }
    static void short_array(int array[]){
        int i = 0;
        int j = array.length - 1;
        while(i < j){
            if(array[i] > array[j]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--; 
            }
        }
        
    }

    static int [] square(int []array){
        int len = array.length;
        int left = 0;
        int right = len - 1;
        int ans [] = new int [len];
        int k = 0;
        while(left <= right){
            if(Math.abs(array[left]) > Math.abs(array[right])){
                ans[k++]=array[left]*array[left];
                left++;
            } else {
                ans[k++] = array[right] * array[right];
                right--;
            }
        }
        return ans ;
    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array1[] = new int [size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<array1.length;i++) array1[i]=sc.nextInt();
        print_arr(array1);   
       int answer[] = square(array1);
       print_arr(answer);   
       short_array(answer);
       print_arr(answer);  
       sc.close(); 
    }
}
