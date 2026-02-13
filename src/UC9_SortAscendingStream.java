import java.util.*;
import java.util.stream.Collectors;

public class UC9_SortAscendingStream {

    public static void main(String[] args) {

        // Creating a List of Numbers
        List<Integer> numbers = Arrays.asList(9, 4, 1, 7, 3, 8);

        // Sorting the stream in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Displaying sorted numbers
        sortedNumbers.forEach(System.out::println);
    }
}
