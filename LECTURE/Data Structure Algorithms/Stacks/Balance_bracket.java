import java.util.Scanner;
import java.util.Stack;

public class Balance_bracket {
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int length = str.length(); // this is the length of the string
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch); // if given bracket is opening then we will push
            else {
                // if(length == 0)return false;
                if (st.peek() == '(')
                    st.pop(); // if the bracket is closing bracket the we will pop 1 opening bracket
            }
        }
        if (st.size() > 0)  // if the brackets are balanced then size of the stack must be 0 if it is not 0 then the bracket is imbalanced 
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bracket : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
