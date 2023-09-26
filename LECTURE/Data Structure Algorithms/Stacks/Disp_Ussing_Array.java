import java.util.Scanner;
import java.util.Stack;

public class Disp_Ussing_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of the stack : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of the stack : ");
        for (int i = 1; i <= num; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        int size = st.size();

        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = st.pop();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            st.push(array[i]);
        }
        sc.close();
    }
}
