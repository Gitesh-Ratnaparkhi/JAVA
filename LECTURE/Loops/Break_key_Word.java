package Loops;
public class Break_key_Word {
    public static void main(String[]args){
        int num1=1;
        while(true){
            if((num1%5==0)&&(num1%7==0)){
                System.out.println("The found ans is "+num1);
                break;
            }
            num1++;
        }
    }
    
}
