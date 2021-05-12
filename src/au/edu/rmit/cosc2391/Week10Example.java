package au.edu.rmit.cosc2391;

@FunctionalInterface
interface MyInterface{
    void display(int x);
}
public class Week10Example {
    public void square(int x){
        System.out.println("Instance Method Square " + x*x);
    }
    public void cube(int x){
        System.out.println("Instance Method Cube " + x*x*x);
    }
    public static void main(String[] args) {
        Week10Example obj = new Week10Example();
        // Method reference using the object of the class
        MyInterface ref = obj::square;
        // Calling the method of functional interface
        ref.display(5);
        ref.display(6);
        ref = obj::cube;
        ref.display(2);
        ref.display(3);
    }
}