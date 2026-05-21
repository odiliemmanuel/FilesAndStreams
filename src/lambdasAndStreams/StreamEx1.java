package lambdasAndStreams;


import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100, 2,  3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .sorted()
                .distinct()
                .forEach((Integer number) -> System.out.println(number));

    }
}
