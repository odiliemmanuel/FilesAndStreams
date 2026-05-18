package lambdasAndStreams;

import java.util.Random;
import java.util.stream.Stream;

public class SupplierImpl {
    public static void main(String[] args) {

        Stream.generate(() -> new Random().nextInt(1, 100))
                .limit(10)
                .forEach((Integer x) -> System.out.println(x));

    }
}
