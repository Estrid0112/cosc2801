package au.edu.rmit.cosc2391;

public class LambdaExample {
    // define an interface which later can be assigned to a concrete method
    interface Operation{
        int op (int a, int b);
    }

    int compute(Operation operation, int a, int b){
        return operation.op(a, b);
    }

    int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        // Assign a concrete method to the interface: the parameters of the method and the interface should be the same
        Operation op = example::multiply;
        System.out.println(example.compute(op,5, 10));

        // Combine the above two statements
        System.out.println(example.compute(example::multiply,5, 10));

        // Further simply it by not defining the multiply method -> Only suitable when the method is short and simple
        System.out.println(example.compute((x, y) -> x * y,5, 10));

    }
}
