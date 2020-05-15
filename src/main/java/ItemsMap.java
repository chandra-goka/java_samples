import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemsMap {

    private Map<String, ItemsList> itemsMap = new HashMap<>();

    public Map<String, ItemsList> getItemsMap() {
        return itemsMap;
    }

    public void setItemsMap(Map<String, ItemsList> itemsMap) {
        this.itemsMap = itemsMap;
    }
}
