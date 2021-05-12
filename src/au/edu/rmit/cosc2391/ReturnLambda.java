package au.edu.rmit.cosc2391;

public class ReturnLambda {
    interface Operator{
        int op(int x);
    }

    public static Operator chooseOperator(String type){
        switch (type){
            case "square": return x->x*x;
            case "increment": return x->x+1;
            case "decrement": return x-> x-1;
            default:
                return x -> x;
        }
    }

    public static void main(String[] args) {
        System.out.println(chooseOperator("square").op(2));
        System.out.println(chooseOperator("increment").op(2));
        System.out.println(chooseOperator("decrement").op(2));
    }
}
