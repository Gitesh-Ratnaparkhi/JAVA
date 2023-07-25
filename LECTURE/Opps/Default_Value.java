package Opps;
// if we does not given any value to the variable then it will give all integers as 0 and others to null.
public class Default_Value {
    public static class student{
        String name;
        int roll_no;
        int phone_no;
    }
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        System.out.println(s1.phone_no);  
    }
}
