import java.util.Scanner;
public class QuickSort {

    // This function is used to peint the array
    public static void print_arr(int arr[]) {
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");
        System.out.println("  ");
    }

    // This is swap function which swap two number
    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int cnt = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                cnt++;
        }
        int pivotdx = start + cnt;
        swap(arr, start, pivotdx);
        int i = start;
        int j = end;
        // elements lesser lefrt , greater right isde of pivotid
        while (i < pivotdx && j > pivotdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[i] > pivot)
                j--;
            if (i < pivotdx && j > pivotdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotdx;
    }

    // This is the quicks sort method 
    static void quicksort(int arra[], int st, int en) {
        if (st >= en)return;
        int pi = partition(arra, st, en);
        quicksort(arra, st, pi - 1);
        quicksort(arra, st + 1, en);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int array[] = new int[size];

        // Taking input in an array
        System.out.println("Enter the element od the array : ");
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        print_arr(array);
        quicksort(array, size , array.length-1);
        System.out.println(" Array after sorting ");
        print_arr(array);
        sc.close();
    }
}

// QuickSort is a sorting algorithm based on the Divide and Conquer algorithm
// that picks an element as a pivot and partitions the given array around the
// picked pivot by placing the pivot in its correct position in the sorted
// array.
// The key process in quickSort is a partition(). The target of partitions is to
// place the pivot (any element can be chosen to be a pivot) at its correct
// position in the sorted array and put all smaller elements to the left of the
// pivot, and all greater elements to the right of the pivot.
// The logic is simple, we start from the leftmost element and keep track of the
// index of smaller (or equal) elements as i. While traversing, if we find a
// smaller element, we swap the current element with arr[i]. Otherwise, we
// ignore the current element.