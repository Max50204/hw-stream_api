package list_of_homeworks;

/*
Поиск минимального числа: Найти минимальное число в списке.
 */

import java.util.List;
        import java.util.Arrays;
        import java.util.Collections;

public class MinElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7, 1);
        int min = Collections.min(numbers);
        System.out.println("Минимальный элемент: " + min);
    }
}