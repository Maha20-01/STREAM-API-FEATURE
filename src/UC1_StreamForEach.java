import java.util.*;

public class UC1_StreamForEach {

    public static void main(String[] args) {

        // Creating a List
        List<String> names = Arrays.asList("Maha", "Arun", "Kiran", "Divya");

        // Creating stream and iterating using forEach
        names.stream().forEach(name -> System.out.println(name));
    }
}
