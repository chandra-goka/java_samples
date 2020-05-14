import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;

public class XMLToObject {
    public static void main(String[] args){
        try {
            String xml = """
                    <Book>
                       <id>1</id>
                       <name>Java</name>
                       <price>200</price>
                    </Book>
                    """;
            Book book = getBookFromString(xml);
            System.out.println(book.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Book getBookFromString(String xml) throws JAXBException{
        JAXBContext jc = JAXBContext.newInstance(Book.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StreamSource streamSource = new StreamSource(new StringReader(xml));
        JAXBElement<Book> jaxbElement = unmarshaller.unmarshal(streamSource, Book.class);

        Book book = jaxbElement.getValue();
        return book;
    }
    public static Book getBookFromFile() throws JAXBException{
        File file = new File("D:\\work\\javaexamples\\src\\main\\java\\book.xml");
        JAXBContext jc = JAXBContext.newInstance(Book.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Book book = (Book)unmarshaller.unmarshal(file);
        return book;
    }
}
