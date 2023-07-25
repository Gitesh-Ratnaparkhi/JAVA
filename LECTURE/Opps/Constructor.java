package Opps;
// Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type. Sometimes constructors are also referred to as special methods to initialize an object.
public class Constructor {
    public static class Student{
        String name;
        int roll_no;
        double percent;
        public Student(String naam , int roll , double per){
            name = naam ;
            roll_no = roll;
            percent = per;
        }
        public int getroll(){
            return roll_no;
        }
        public void setroll(int roll_no){
        this.roll_no = roll_no;
        }
    }
    public static void main(String[] args) {
        Student obj = new Student("Gitesh Ratnaparkhi", 98837, 890);
        System.out.println(obj.name);
        System.out.println(obj.roll_no);
        System.out.println(obj.percent);
    }
}