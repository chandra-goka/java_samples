import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        Long count = stream.collect(Collectors.counting());
        System.out.println("Stream Count: "+count);
    }
}

