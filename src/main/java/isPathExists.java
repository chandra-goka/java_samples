import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class isPathExists {

        public static void main(String[] args) throws Exception {
            Path path = Paths.get("/Users/chandra/sample.txt");
            System.out.println("isPathExists: " + Files.exists(path));
            System.out.println("isnotExists: " + Files.notExists(path));

        }

}
