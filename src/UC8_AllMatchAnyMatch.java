import java.util.*;

public class UC8_AllMatchAnyMatch {

    public static void main(String[] args) {

        // Creating a List of Numbers
        List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8);

        // Checking if all numbers are even
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        // Checking if at least one number is even
        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        // Displaying results
        System.out.println("Are all numbers even? " + allEven);
        System.out.println("Is at least one number even? " + anyEven);
    }
}
