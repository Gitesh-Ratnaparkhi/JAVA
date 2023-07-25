package Opps;
public class Final_keyword {
    public static class Student{
        String name ;
        int roll_no ;
        double percent ;
        final String School_name = "St paul School";
        public Student(String name , int roll_no ,double percent ){
            this.name = name ;
            this.roll_no = roll_no ;
            this.percent = percent ;
        }
        public int setroll_no(int roll_no , int name , double percent ){
            return roll_no;
        }
        public void setroll(int roll_no){
            this.roll_no = roll_no;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(null, 0, 0);
        s1.percent= 83;
        s1.name="giti";
        s1.roll_no=8346;
        System.out.println(s1.School_name);
    }
}
