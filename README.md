# Java Streams API – Use Case Implementation (UC1–UC9)

This project demonstrates the usage of Java 8 Streams API through a set of
clearly defined use cases. Each use case focuses on a specific stream
operation such as iteration, transformation, filtering, sorting, aggregation,
and matching.

---

## Technologies Used
- Java 8 or above
- Java Streams API
- Collections Framework
- Git and GitHub

---

## Use Case Implementations

### UC-1: Create Stream and Iterate
- Create a stream from a collection
- Iterate and display elements using `forEach()`

### UC-2: Transform Elements to Double
- Transform each element using `map()`
- Store transformed values using `collect()`

### UC-3: Sort the Number Stream
- Sort elements of a number stream
- Use `sorted()` for ascending order

### UC-4: Filter Even Numbers
- Filter even numbers from a number stream
- Store the filtered result using `collect()`

### UC-5: Find First Even Number
- Identify the first even number in the stream
- Use `findFirst()` to retrieve the element

### UC-6: Find Minimum and Maximum Even Number
- Find the smallest even number using `min()`
- Find the largest even number using `max()`

### UC-7: Find Sum and Average
- Calculate the sum of elements using `reduce()`
- Calculate the average using `mapToInt().average()`

### UC-8: Check Even Numbers Using Match Operations
- Check if all numbers are even using `allMatch()`
- Check if at least one number is even using `anyMatch()`

### UC-9: Sort the Number Stream in Ascending Order
- Sort numeric stream elements in ascending order
- Use `stream().sorted()` function
