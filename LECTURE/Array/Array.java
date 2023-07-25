public class Array {
    void demoArray(){
        int[] ages=new int[3];
        // float[] weights= new float[3];
        // String[]names=new String[3];
         ages[0]=34;
        ages[1]=63;
        ages[2]=45;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
    public static void main(String[] args) {
        Array obj = new Array();
        obj.demoArray();    
    }
}

