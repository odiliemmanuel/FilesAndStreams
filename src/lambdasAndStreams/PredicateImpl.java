package lambdasAndStreams;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<String> predicate = (String text) -> text.length() >= 5;
        System.out.println(predicate.test("Hello"));
    }
}
