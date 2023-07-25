import java.util.Scanner;
public class TakingString{
    public static void main(String[]args, String string){
        Scanner giti = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = giti.next();
        System.out.println("The entered name is "+ name);
        // NOtE the above code if we give name as Gitesh Suresh Rantnaparkhi then it will only print Gitesh 
        // but not Suresh Ratnaparkhi because giti.next stop if the space came in String
        // To avoid that we use giti.nextLine();
        System.out.println("Enter your name ");
        String Full_name = giti.nextLine();
        System.out.println("The entered name is "+Full_name);
        giti.close();
    }
}
