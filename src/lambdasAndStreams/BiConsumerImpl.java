package lambdasAndStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (String text, Integer length) -> {
            System.out.println(text + " " + length);
        };

        Map<String, Integer> consumer = new HashMap<>();
        consumer.put("Hello", 1);
        consumer.put("World", 2);

        consumer.forEach(biConsumer);
    }
}
