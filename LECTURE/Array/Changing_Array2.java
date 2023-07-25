public class Changing_Array2 {
    static void change_arr(int[]arr){
    for(int i=0;i<arr.length;i++){
    arr[i]=0;
    System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int array[]=new int[3];
        array[0]=1;
        array[1]=1;
        array[2]=1;
        change_arr(array);
    }
        
}
    