package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeparateList {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(4);
        intList.add(2);
        intList.add(8);
        intList.add(10);
        intList.add(5);
        intList.add(7);
      //  intList.add(7);

        int part = 2;
        System.out.println(outPut(intList, part));
    }
    public static List<List<Integer>> outPut(List<Integer> list, int part){
        List<List<Integer>> outputList = new ArrayList<>();
       outputList =  IntStream.range(0, (int) Math.ceil((double) list.size()/ part))
                .mapToObj(n-> list.subList(n*part, Math.min (n*part + part, list.size())))
                        .collect(Collectors.toList());

        return outputList;
    }
}
