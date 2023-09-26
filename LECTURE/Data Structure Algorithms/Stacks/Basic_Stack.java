import java.util.Stack;
public class Basic_Stack{
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(23);
        st.push(57);
        st.push(69);
        st.push(100);
        st.push(101);
        System.out.println(st.peek());
    }
}

// Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.