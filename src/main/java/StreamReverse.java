import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamReverse {
    public static void main(String[] args) {
        deQueue();
        reverseRange(1,10);
    }

    public static void deQueue(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    public static void reverseRange(int from, int to){
        IntStream.range(from, to)
                .map(i -> to - i + from - 1)
                .forEach(System.out::println);
    }
}
