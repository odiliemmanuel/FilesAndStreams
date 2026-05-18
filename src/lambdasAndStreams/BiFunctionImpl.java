package lambdasAndStreams;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<String, Integer, Double> biFunction = (String text, Integer number) -> (double) (text.length()/number);

        System.out.println(biFunction.apply("Hello Flash", 10));

    }
}
