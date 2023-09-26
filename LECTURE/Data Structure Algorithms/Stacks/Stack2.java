import java.util.Stack;
public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push method will push elements in the stack 
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(56);
        st.push(10);
        st.push(10);

        // peek will give the first element of the given Stack
        System.out.println(st.peek());
        System.out.println(st);

        // pop function will remove the first element from the array
        st.pop();
        System.out.println(st);
        System.out.println("Size of the given stack is : "+ st.size());
    }
}
