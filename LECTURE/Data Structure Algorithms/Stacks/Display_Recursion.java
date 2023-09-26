import java.util.Scanner;
import java.util.Stack;

public class Display_Recursion {

    static void display_stack(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.print(top + " ");
        display_stack(st);
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
        display_stack(st);
        sc.close();
    }
}

// if we given stack as [1 2 3 4 5]
// 1st call 5
// 2nd call 4
// 3rd call 3
// 4th call 2
// 5th call 1
// now the condition will satistfied the recursion wil stop
// after first returning satck will be [1]
// after 2nd returning satck will be [1 2]
// after 3rd returning satck will be [1 2 3]
// after 4th returning satck will be [1 2 3 4]
// after 5th returning satck will be [1 2 3 4 5]
