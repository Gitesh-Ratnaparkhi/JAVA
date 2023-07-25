import java.util.Scanner;
public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The size of the array ");
        int num1=sc.nextInt();
        int array[]=new int [num1];
        System.out.println("Enter "+num1+" elements");   
        for(int i=0;i<=array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<=array.length;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
