import java.util.Scanner;
public class predefined_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int [10];
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int i=0;i<array.length;i++) System.out.println(array[i]);
        sc.close();
    }
    
}
