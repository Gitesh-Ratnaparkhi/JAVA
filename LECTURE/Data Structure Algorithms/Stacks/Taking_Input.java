import java.util.Scanner;
import java.util.Stack;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        System.out.println("Enter the number which you have to print : ");
        int num = sc.nextInt();
        for(int i = 0 ; i<num ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        sc.close();
    }
    
}
