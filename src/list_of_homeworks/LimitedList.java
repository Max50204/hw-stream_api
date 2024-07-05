package list_of_homeworks;
/*
Aufgabe: Ограничение списка: Ограничить количество элементов в списке до первых 10.
 */

import java.util.ArrayList;
        import java.util.List;

public class LimitedList {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();

        // Заполняем список
        for (int i = 1; i <= 20; i++) {
            originalList.add(i);
        }

        // Ограничим количество элементов в списке до первых 10
        List<Integer> limitedList = limitList(originalList, 10);

        // Выводим результат
        System.out.println("Original List: " + originalList);
        System.out.println("Limited List: " + limitedList);
    }

    public static <T> List<T> limitList(List<T> list, int limit) {
        if (list.size() <= limit) {
            return new ArrayList<>(list);
        }
        return new ArrayList<>(list.subList(0, limit));
    }
}
