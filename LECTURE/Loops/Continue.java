package Loops;

public class Continue {
    public static void main(String[]args){
        int n=50;
        for(int i=0;i<=n;i++){
            if(i%3==0) System.out.println("The entered number is divisibe by "+i);
            continue;
        }
    }
}
