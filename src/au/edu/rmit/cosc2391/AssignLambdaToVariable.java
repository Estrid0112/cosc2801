package au.edu.rmit.cosc2391;

public class AssignLambdaToVariable {
    interface Operator{
        int op(int x);
    }

    public static void main(String[] args) {
        Operator square = x -> x*x ;
        System.out.println(square.op(2));
    }
}
