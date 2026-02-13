import java.util.*;

public class UC5_FindFirstEven {

    public static void main(String[] args) {

        // Creating a List of Numbers
        List<Integer> numbers = Arrays.asList(3, 7, 9, 12, 15, 20);

        // Finding the first even number
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        // Displaying the result
        if (firstEven.isPresent()) {
            System.out.println("First Even Number: " + firstEven.get());
        } else {
            System.out.println("No even number found");
        }
    }
}
