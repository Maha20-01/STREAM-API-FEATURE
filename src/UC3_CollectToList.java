import java.util.*;
import java.util.stream.Collectors;

public class UC3_CollectToList {

    public static void main(String[] args) {

        // Creating a List of Integers
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        // Transforming to double and collecting into a new List
        List<Double> doubleList = numbers.stream()
                .map(n -> n.doubleValue())
                .collect(Collectors.toList());

        // Displaying the new List
        doubleList.forEach(System.out::println);
    }
}
