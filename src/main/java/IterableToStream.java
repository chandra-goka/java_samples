import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableToStream {
    public static void main(String[] args) {
        Iterable<String> iterable
                = Arrays.asList("Apple", "Grapes", "Banana", "Mango");
        Stream<String> stream = StreamSupport.stream(iterable.spliterator(), false);
        stream.filter(fruits->fruits.startsWith("A")).forEach(System.out::print);
    }
}
