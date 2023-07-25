package Opps;
public class Setters {
    public static class Student{
        public String name ;
        private int roll_no ; 
        double percent ;
        // getters 
        public int getroll(){
            return roll_no;
        }
        // Setters 
        public void setroll(int roll){
            roll_no = roll;
        }
    }
    public static void main(String[] args) {
        Student object = new Student();
        object.name="Silki";
        object.roll_no=8738;
        object.percent = 98;
        System.out.println("Name of the student "+object.name);
        System.out.println("Roll number of the student "+object.roll_no);
        System.out.println("percent of the student "+object.percent);

    }
}
