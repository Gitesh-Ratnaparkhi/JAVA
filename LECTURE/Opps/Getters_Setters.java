package Opps;
public class Getters_Setters {
    public static class student{
        public String name ;
        private int roll ; 
        double percent ; 
        public int getroll(){
            return roll;
        }
    }
    public static void main(String[] args) {
        student object = new student();
        System.out.println("Name of the sudent is "+object.name);
        System.out.println("percent of the stuent "+object.percent);
        System.out.println("Roll no of the stuent "+object.getroll());
    }
}

// In Java, Getter and Setter are methods used to protect your data and make your code more secure. Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
// Getter in Java: Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc. For the program’s convenience, the getter starts with the word “get” followed by the variable name.
// Setter in Java: While Setter sets or updates the value (mutators). It sets the value for any variable used in a class’s programs. and starts with the word “set” followed by the variable name.