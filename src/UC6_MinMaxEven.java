import java.util.*;

public class UC6_MinMaxEven {

    public static void main(String[] args) {

        // Creating a List of Numbers
        List<Integer> numbers = Arrays.asList(8, 3, 14, 6, 21, 10, 2);

        // Finding minimum even number
        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo);

        // Finding maximum even number
        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        // Displaying results
        minEven.ifPresent(n -> System.out.println("Minimum Even Number: " + n));
        maxEven.ifPresent(n -> System.out.println("Maximum Even Number: " + n));
    }
}
