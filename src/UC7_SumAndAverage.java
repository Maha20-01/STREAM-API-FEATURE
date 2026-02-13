import java.util.*;

public class UC7_SumAndAverage {

    public static void main(String[] args) {

        // Creating a List of Numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Finding sum using reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        // Finding average
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        // Displaying results
        System.out.println("Sum: " + sum);

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        }
    }
}
