import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemsList {
    private List<Item> item = new ArrayList<>();

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> itemsList) {
        this.item = item;
    }
}
