import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathToFile {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/Users/chan8047/sample.txt");

        File file = path.toFile();

        Path p = file.toPath();
        System.out.println("path :: "+p);

        if (file.exists()) {
            System.out.println("The File Existed");
        } else {
            System.out.println("The File does not exist");
        }
    }
}

class FileToPath {

    public static void main(String[] args) throws Exception {

        File file = new File("/Users/chan8047/sample.txt");

        Path path = file.toPath();
        System.out.println("path :: "+path);

    }
}
