package stream_api.homeworks;


import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

public class DeletedBackSpace {
    public static void main(String[] args) {
        // Пример списка строк
        List<String> strings = Arrays.asList("Hello worl4", "Java is fun", "Stream API");

        // Преобразование списка строк в один список слов
        List<String> words = strings.stream()
                .flatMap(str -> Arrays.stream(str.split("\\s+")))
                .collect(Collectors.toList());

        // Вывод результата
        System.out.println(words);
    }
}
