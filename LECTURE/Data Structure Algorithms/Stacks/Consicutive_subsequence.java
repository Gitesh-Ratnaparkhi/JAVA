import java.util.*;

public class Consicutive_subsequence {
    public static int[] remove(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);
            else if (arr[i] == st.peek()) {
                if (i == n - 1 || arr[i] != arr[i + 1])st.pop();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
            }
        }
        int res[] = new int[st.size()];
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
        int array[] = new int[size];
        System.out.println("Enter the elementes of the array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int res[] = remove(array);
        System.out.println("The out put is :");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
