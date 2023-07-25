package Opps;
public class Static_Keyword{
    public static class static_Keyword{
        String name ;
        int roll_no ;
        double percent ;
        final String School_Name ="St paul School";
        int number_Students ;
        public static_Keyword(String name , int roll_no ,double percent){
            this.name = name;
            this.roll_no = roll_no;
            this.percent= percent;
            number_Students++;
        }
        public int getroll_no(){
            return roll_no;
        }
        public void setroll_no(int roll_no){
            this.roll_no = roll_no;
        }
   
    }
    public static void main(String[] args) {
        static_Keyword S1 = new static_Keyword("gitesh", 22414, 78);
        System.out.println(S1.number_Students);
    }
}