package stream_api;

public class HandDrücken {
    public static void main(String[] args) {

        System.out.println(res(17));
    }

    public static int res(int people) {
        int sum = 0;
        for (int i = 0; i < people; i++) {

            sum = sum + i;

        }

            return sum;
    }
}
