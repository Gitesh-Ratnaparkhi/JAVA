package Opps;
// Access Specifiers in java. There are three access spcifiers in java 
// public , private , default
public class Student_private {
    public static class student{
        String name ;
        private int roll_no ;
        double  percent ; 
    }
    public static void main(String[] args) {
        student si =new student();
        si.name = "Gitesh Ratnaparkhi";
        si.roll_no = 9878957;
        si.percent=83;
        System.out.println(si.name);
        System.out.println(si.roll_no);
        System.out.println(si.percent);
    }
}
