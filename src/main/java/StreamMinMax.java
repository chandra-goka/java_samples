import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static void main(String[] args) {

        // Numbers
        Collection<Integer> elements = Arrays.asList(1,2,3,4,5);
        Integer min = elements.stream().min(Integer::compareTo).get();
        Integer max = elements.stream().max(Integer::compareTo).get();
        System.out.println("Min value : "+min);
        System.out.println("Max value : "+max);

        // Strings
        Collection<String> strings = Arrays.asList("a1","a2","a3","a4");
        String min_string = strings.stream().min(String::compareTo).get();
        String max_string = strings.stream().max(String::compareTo).get();
        System.out.println("Min value : "+min_string);
        System.out.println("Max value : "+max_string);

        // Objects
        Collection<Student> students = Arrays.asList(new Student("Chandra",30),new Student("Rahul",25)
                ,new Student("Robert",20));
        Student younger = students.stream().min((s1,s2)->s1.getAge().compareTo(s2.getAge())).get();
        Student elder = students.stream().max((s1,s2)->s1.getAge().compareTo(s2.getAge())).get();
        System.out.println("Younger is : "+younger.getName());
        System.out.println("Elder is : "+elder.getName());
    }
}

class Student{
    private String name;
    private Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
