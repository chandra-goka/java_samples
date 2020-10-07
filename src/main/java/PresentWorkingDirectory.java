import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class PresentWorkingDirectory {
    public static void main(String[] args) {
        getPresentWorkingDirectory();
        getPresentWorkingDirectory1();
        getPresentWorkingDirectory2();
        getPresentWorkingDirectory3();
    }

    private static void getPresentWorkingDirectory() {
        String pwd = System.getProperty("user.dir");
        System.out.println(pwd);
    }
    private static void getPresentWorkingDirectory1() {
        String pwd = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(pwd);
    }

    private static void getPresentWorkingDirectory2() {
        String pwd = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString();
        System.out.println(pwd);
    }

    private static void getPresentWorkingDirectory3() {
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
    }
}
