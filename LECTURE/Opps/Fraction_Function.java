package Opps;
public class Fraction_Function {
    public static int gcd(int num , int den){
        int min = Math.min(num , den);
        for(int i = min;i>=1; i--){
            if(num%i==0 && den%i==0)return i ;
        }
        return min;
    }
    public static class fraction{
        int num;
        int den;
        public fraction(int num , int den){
            this.num = num;
            this.den= den;
            Simplify();
        }
        public void Simplify(){
            int hcf = gcd(num ,den);
            num/=hcf;
            den/=hcf;
        }
    }
    public static fraction fraction_add(fraction f1,fraction f2){
        int numerator = f1.num*f2.den+f1.den+f2.num;
        int denominator = f1.den*f2.den;
        fraction f3 = new fraction(numerator, denominator);
        return f3;
    }

    public static fraction fraction_mul(fraction f1 ,fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        fraction f3 = new fraction(numerator, denominator);
        return f3;
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(35, 21);
        fraction f2 = new fraction(7, 3);
        System.out.println(f1.num+"/"+f1.den);
        System.out.println(f2.num+"/"+f2.den);
        fraction f3 =fraction_add(f1, f2);
        System.out.println(f3.num+"/"+f3.den);
        fraction f4 = fraction_mul(f1, f2);
        System.out.println(f4.num+"/"+f4.den);
    }
}
