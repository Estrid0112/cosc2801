package au.edu.rmit.cosc2391;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionInSort {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(10, 2, 46, 3, 97, 26, 6);
        // Lambda expression here!!! This comparator will sort the array in descending order.
        array.sort((x1, x2) -> x2 - x1);
        System.out.println(array);
    }
}
