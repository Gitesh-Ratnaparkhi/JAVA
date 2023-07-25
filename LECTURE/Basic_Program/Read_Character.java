import java.util.Scanner;
public class Read_Character{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character ");
        char ch = sc.next().charAt(0);
        System.out.print("Character = "+ch);
        sc.close();
        
    }
}