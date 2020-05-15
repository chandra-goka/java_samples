import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.*;

public class MapToXML {
    public static void main(String[] args) throws JAXBException {
        HashMap<String, ItemsList> map = new HashMap<>();
        map.put("electronics",getElecrtonics());
        map.put("books",getBooks());

        ItemsMap iMap = new ItemsMap();
        iMap.setItemsMap(map);

        JAXBContext jaxbContext = JAXBContext.newInstance(ItemsMap.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(iMap, System.out);
        jaxbMarshaller.marshal(iMap, new File("itemsmap.xml"));
    }
    public static ItemsList getElecrtonics(){
        ArrayList<Item> list = new ArrayList<Item>(Arrays.asList(new Item(100,"Samsung",15000.00),
                new Item(200,"iPhone10",110000.00)));
        ItemsList itemsList = new ItemsList();
        itemsList.getItem().addAll(list);
        return itemsList;
    }
    public static ItemsList getBooks(){
        ArrayList<Item> list = new ArrayList<Item>(Arrays.asList(new Item(2000,"Core Java",500.00),
                new Item(3000,"Spring in Action",750.00)));
        ItemsList itemsList = new ItemsList();
        itemsList.getItem().addAll(list);
        return itemsList;
    }
}
