package lambdasAndStreams;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (String text) -> text;
    }
}
