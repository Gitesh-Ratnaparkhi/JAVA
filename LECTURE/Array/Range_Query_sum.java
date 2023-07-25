import java.util.Scanner;

public class Range_Query_sum{
    public static void print_arr(int array[]){
        for(int j = 0 ;j<array.length ; j++) System.out.print(array[j]+" ");
        System.out.println("  ");
    }
    static int prifixsum_array(int array[], int query){
        int sum = 0;
        for(int i = 0; i < query ; i++) sum = sum + array[i];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int [size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<=array.length-1;i++) array[i]=sc.nextInt();
        System.out.println("Enter the query");
        int query = sc.nextInt();
        print_arr(array);  
        System.out.println("The sum upto given query is "+ prifixsum_array(array,query));  
        sc.close();
    }
}
