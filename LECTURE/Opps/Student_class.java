package Opps;
// As the name suggests, Object-Oriented Programming or OOPs refers to languages that use objects in programming, they use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks assigned by you. Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc. in programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function. 
public class Student_class {

    // creating the class of name student 
    public static class Student{
        String name ;
        int roll_no;
        double parcent ;
    }

    public static void main(String[] args) {
        // creating the object of the class student. 
        Student obj = new Student();
        // using object we can call all the values of the class 
        obj.name = "Ragav";
        obj.roll_no = 76;
        obj.parcent = 92.5;
        System.out.println(obj.name);
        System.out.println(obj.roll_no);
        System.out.println(obj.parcent);
    }
}
