import java.util.*;

public class UC2_MapToDouble {

    public static void main(String[] args) {

        // Creating a List of Integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        // Transforming each element to double
        List<Double> doubleValues = numbers.stream()
                .map(n -> n.doubleValue())
                .toList();

        // Displaying the result
        doubleValues.forEach(System.out::println);
    }
}
