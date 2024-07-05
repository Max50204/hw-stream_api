package stream_api.homeworks;

/*
Суммирование чисел: Найти сумму всех чисел в списке.
 */

public class SumNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Сумма всех чисел в массиве: " + sum);
    }
}


/*
 Über ArrayList:


import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Сумма всех чисел в списке: " + sum);
    }
}



Über Stream_Api:



import java.util.Arrays;
import java.util.List;

public class SumStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Сумма всех чисел в списке: " + sum);
    }
}

Über Recursion:

public class SumRecursive {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers, numbers.length);
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }

    public static int sumArray(int[] array, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return sumArray(array, n - 1) + array[n - 1];
        }
    }
}
 */