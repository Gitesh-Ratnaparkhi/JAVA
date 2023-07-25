package JAVA.SWAYAM;
public class Gen_tree{
    public class MyGenericclass <T extends Number>{
        private T data;
        public MyGenericclass(T data){
            this.data = data;
        }
        public double square(){
            return data.doubleValue() * data.doubleValue();
        }
    }
    MyGenericclass<Integer> integerObj = new MyGenericclass<>(5);
    // MyGenericclass <String> StringObj = new MyGenericclass<>("Hello");
    double result1 = integerObj.square();
    // double result3 = StringObj.square();

}