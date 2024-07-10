package stream_api;

        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

public class List_Of_Lists{
    public static void main(String[] args) {
        // Пример списка списков целых чисел
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        // Преобразование списка списков в один список всех чисел
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // Вывод результата
        System.out.println(flatList);
    }
}
