package stream_api.homeworks;

import java.util.function.IntUnaryOperator;
        import java.util.Arrays;

public class Exercise_Four {
    public static int[] process(int[] a, IntUnaryOperator operator) {
        return Arrays.stream(a).map(operator).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        IntUnaryOperator incrOperator = e -> e + 1;

        int[] result = process(array, incrOperator);

        System.out.println(Arrays.toString(result)); // Output: [2, 3, 4, 5, 6]
    }
}
