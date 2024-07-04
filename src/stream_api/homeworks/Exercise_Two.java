package stream_api.homeworks;



import java.util.Arrays;


public class Exercise_Two {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers)
                .forEach(Utils:: process);
    }
     class Utils{

         public static void process(int a){
             a = a*a;
             System.out.println("Neue element: "+a);
         }
     }

}
