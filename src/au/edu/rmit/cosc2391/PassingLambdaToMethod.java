package au.edu.rmit.cosc2391;

public class PassingLambdaToMethod {
    interface Operator{
        int op(int x);
    }

    public static void print(int parameter, Operator operator){
        System.out.println(operator.op(parameter));
    }

    public static void main(String[] args) {
        print(2, x->x*x);
    }
}
