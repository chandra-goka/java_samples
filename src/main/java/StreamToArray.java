import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {

        // Stream of Strings to String[]
        Stream<String> stringStream = Stream.of("JAVA", "SPRING", "HIBERNATE");
        String[] stringArray = stringStream.toArray(String[]::new);
        Arrays.stream(stringArray).forEach(System.out::println);

        Stream<String> stringStream3 = Stream.of("JAVA", "SPRING", "HIBERNATE");
        stringArray = stringStream3.toArray(size -> new String[size]);
        Arrays.stream(stringArray).forEach(System.out::println);

        //Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> intStream = IntStream.rangeClosed(1, 10).boxed();
        int[] array =  intStream.mapToInt(x -> x).toArray();
        Arrays.stream(array).forEach(System.out::println);

        // Stream of Objects to Array of objects
        Stream<Book> objectStream = Stream.of(new Book(1,"Thinking in Java",1500),
                new Book(2,"Inide Java Vertual Machine",570));
        Object[] stringArray2 = objectStream.toArray(Object[]::new);
        Arrays.stream(stringArray2).forEach(System.out::println);
    }
}
