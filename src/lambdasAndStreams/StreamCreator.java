package lambdasAndStreams;


import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {
        Set<String> words = Set.of("ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX");

        System.out.println(words.stream().toList());
        Stream<Integer> integerStream = Stream.of( 10, 20, 30, 40, 50, 60,70, 80, 90,100);
        integerStream.takeWhile((Integer number) -> number < 50)
                .forEach(System.out::println);


        System.out.println(IntStream.rangeClosed(1, 10).reduce(0, ( a,  b) -> a * b));
    }
}
