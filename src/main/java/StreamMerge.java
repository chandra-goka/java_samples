import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(4,2,1);
        Stream<Integer> stream3 = Stream.of(3,5,6);
        Stream<Integer> stream1_stream2_stream3 = Stream.concat(Stream.concat(stream1, stream2),stream3);
        System.out.println(stream1_stream2_stream3.distinct().collect(Collectors.toList()));

    }
}
