import java.util.*;
import java.util.stream.Collectors;

public class UC4_FilterEvenNumbers {

    public static void main(String[] args) {

        // Creating a List of Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Filtering even numbers and storing the result
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Displaying even numbers
        evenNumbers.forEach(System.out::println);
    }
}
