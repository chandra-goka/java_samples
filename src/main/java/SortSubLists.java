import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chan8047
 * @date 10/08/21
 */
class SubGroupName{
    int languageCode;
    String languageName;
    public SubGroupName(int languageCode, String languageName) {
        this.languageCode = languageCode;
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }
    public int getLanguageCode() {
        return languageCode;
    }

    @Override
    public String toString() {
        return "SubGroupName{" +
                "languageCode=" + languageCode +
                ", languageName='" + languageName + '\'' +
                '}';
    }
}
class DemoSubGroup{
    int id;
    int pricing;
    Set<SubGroupName> names;

    public DemoSubGroup() {
    }

    public DemoSubGroup(int id, int pricing, Set<SubGroupName> names) {
        this.id = id;
        this.pricing = pricing;
        this.names = names;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setPricing(int pricing) {
        this.pricing = pricing;
    }

    public int getPricing() {
        return pricing;
    }

    public Set<SubGroupName> getNames() {
        return names;
    }

    public void setNames(Set<SubGroupName> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "DemoSubGroup{" +
                "id=" + id +
                ", pricing=" + pricing +
                ", names=" + names +
                '}';
    }
}

public class SortSubLists {
    public static void main(String[] args) {
        Set<SubGroupName> inner = new HashSet();
        SubGroupName sn = new SubGroupName(1, "Rohit");
        SubGroupName sn2 = new SubGroupName(1, "Kranthi");
        SubGroupName sn3 = new SubGroupName(1, "Satya");
        DemoSubGroup demoSubGroup = new DemoSubGroup();
        inner.add(sn);
        inner.add(sn2);
        inner.add(sn3);
        demoSubGroup.setId(1);
        demoSubGroup.setPricing(100);
        demoSubGroup.setNames(inner);
        List<DemoSubGroup> groups = new ArrayList<>();
        groups.add(demoSubGroup);
        System.out.println("Before Sorting..");
        System.out.println(demoSubGroup);
        System.out.println("After Sorting..");
        List<DemoSubGroup> sorted = groups.stream()
                .map(ds -> new DemoSubGroup(ds.getId(), ds.getPricing(),
                        ds.getNames().stream().filter(data -> data.getLanguageCode() == 1).sorted(Comparator.comparing(SubGroupName::getLanguageName))
                        .collect(Collectors.toSet())))
                .sorted().collect(Collectors.toList());
        sorted.forEach(System.out::println);
    }
}
