package Opps;

public class Fraction_Class {
    public static class fraction_Class{
        int num ;
        int den ;
        public fraction_Class(int num , int den){
            this.num = num;
            this.den = den;
        }
    }
    public static void main(String[] args) {
        fraction_Class F1 = new fraction_Class(3, 7);
        fraction_Class F2 = new fraction_Class(7, 3);
        System.out.println(F2.num+ "/" +F1.den); 
        System.out.println(F2.num + "/" + F2.den);
    }
}
