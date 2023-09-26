import java.util.Scanner;
import java.util.Stack;

public class Same_Copy_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of the stack : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();
        while (st.size() > 0) {
            st2.push(st.pop());
        }
        Stack<Integer> st3 = new Stack<>();
        while (st2.size() > 0) {
            st3.push(st2.pop());
        }
        System.out.println(st3);
        sc.close();
    }
}
