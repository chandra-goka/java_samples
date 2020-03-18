import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> result = list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());
        result.forEach(System.out::print);

        List<Integer> finalList =  list1.stream().filter(item-> !list2.contains(item)).collect(Collectors.toList());

        finalList.stream().forEach(System.out::print);
    }
}
