import java.util.Scanner;
public class Sort_Fruits{
    static void print_arr(String arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
        System.out.println("  ");
    }
    public static void sort_fruits(String array[]){
        int n = array.length;
        for(int i = 0; i <array.length;i++){
            int main_index = i;
            for(int j = i+1 ; j< n; j++){
                if(array[j].compareTo(array[main_index])<0)main_index = j ;
            }
            String temp = array[i];
            array[i] = array[main_index];
            array[main_index] = temp ; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] ={"kiwi" , "apple " , "papaya " , "mango "};
        print_arr(array);
        sort_fruits(array);
        print_arr(array);
        sc.close();
    }
}