import java.util.Scanner;
import java.util.Stack;

public class Insert_Bottom {
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
        System.out.println("Enter the element at which you have yo inset an element : ");
        int index = sc.nextInt();
        System.out.println("Enter the element which you have to insert : ");
        int ele = sc.nextInt();
        Stack<Integer> st2 = new Stack<>();
        while (st.size() > index) {
            st2.push(st.pop());
        }
        st.push(ele);
        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        System.out.println("Stack after adding an element in the given stack : ");
        System.out.println(st);
        sc.close();
    }
}

// NOTE in stack indexing start from 0 