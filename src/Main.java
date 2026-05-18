import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

//        ConsoleDataReader.readData();
       List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int position = Collections.binarySearch(numbers, 10);

        System.out.println(position);


    }

}