import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaCreateDirectory {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/Users/chandra/Work/hello/");
        Files.createDirectory(path);

        Path path2 = Paths.get("/Users/chandra/Work/hello/parent1/parent2/");
        Files.createDirectories(path2);

        File file = new File("/Users/chandra/test");

        // true if the directory was created, false otherwise
        if (file.mkdirs()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Failed to create directory!");
        }
    }
}
