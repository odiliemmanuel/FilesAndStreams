package lambdasAndStreams;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (number, text) -> text.length() > number;
    }
}
