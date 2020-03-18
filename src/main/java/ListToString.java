
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Java","Spring","Hibernate","Python","C");
        String countrieswithComma = String.join(",",countries);
        System.out.println(countrieswithComma);

        countrieswithComma = countries.stream().collect(Collectors.joining(","));
        System.out.println(countrieswithComma);

        countrieswithComma = countries.stream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(countrieswithComma);

        StringBuffer buffer = new StringBuffer();
        for (String country : countries){
            buffer.append(country).append(",");
        }
        buffer.deleteCharAt(buffer.lastIndexOf(",")); // To remove leading comma
        countrieswithComma= buffer.toString();
        System.out.println(countrieswithComma);
    }
}
