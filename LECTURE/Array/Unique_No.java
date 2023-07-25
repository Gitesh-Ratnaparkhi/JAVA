import java.util.Scanner;
public class Unique_No {
    static int unique_element(int array[]){
        int ans=-1;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        for(int k=0;k<array.length;k++){
            if(array[k]>0) ans=array[k];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<array.length;i++) array[i]=sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");
        System.out.println("The unique element is "+unique_element(array));
        sc.close();
    }  
}
