import java.util.Stack;

public class First_Element {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Size of the given stack is "+ st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
