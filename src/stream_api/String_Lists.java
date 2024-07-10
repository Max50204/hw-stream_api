package stream_api;


import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class String_Lists {
    public static void main(String[] args) {
        // Создаем список списков строк
        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList("apple", "banana"));
        listOfLists.add(Arrays.asList("cherry", "date"));
        listOfLists.add(Arrays.asList("elderberry", "fig"));

        // Преобразуем список списков в один список
        List<String> singleList = new ArrayList<>();
        for (List<String> list : listOfLists) {
            singleList.addAll(list);
        }

        // Выводим результат
        System.out.println(singleList);
    }
}
