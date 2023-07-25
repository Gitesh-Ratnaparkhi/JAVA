package Methods;

public class Access_Pecifier {
    String str_1 ="I am a public member ";
    void print(){
        System.out.println("With in class : "+ str_1);
    }
    public static void main(String[] args) {
        Access_Pecifier obj = new Access_Pecifier();
        obj.print();
        System.out.println(obj.str_1);
    }
}
