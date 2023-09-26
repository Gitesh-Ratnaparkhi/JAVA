import java.util.Scanner;
import java.util.Stack;

public class Reverse_Recursion {
    static void reverse_recursion(Stack<Integer> st){
        if(st.size() == 0) return ;
        int top = st.pop();
        reverse_recursion(st);
        push_At_bottom(top , st);
    }
    static void push_At_bottom(int x , Stack<Integer> st ){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        push_At_bottom(x, st);
        st.push(top);
    }
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
        reverse_recursion(st);
        System.out.println(st);
        sc.close();
    }
}
