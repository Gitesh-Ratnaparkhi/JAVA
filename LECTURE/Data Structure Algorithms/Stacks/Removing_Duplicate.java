import java.util.Scanner;
import java.util.Stack;

public class Removing_Duplicate {
    public static int[] remove(int[] arr) {
        int len = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if (i == len - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int[] res = new int[st.size()];
        int m = res.length;
        for (int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the given array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
        sc.close();
    }
}
