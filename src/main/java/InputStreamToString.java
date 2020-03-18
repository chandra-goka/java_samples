
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputStreamToString {
    public static void main(String[] args) throws Exception{
        System.out.println("inputStreamReader : "+inputStreamReader());
        System.out.println("apacheIOUtils : "+apacheIOUtils());
        System.out.println("scanner : "+scanner());
        System.out.println("streams : "+streams());
        System.out.println("parallelStreams : "+parallelStreams());
    }

    public static String apacheIOUtils() throws Exception{
        StringWriter writer = new StringWriter();
        IOUtils.copy(getInputStream(), writer, "UTF-8");
        return writer.toString();
    }

    public static String scanner(){
        Scanner s = new Scanner(getInputStream()).useDelimiter("\n");
        StringBuilder builder = new StringBuilder();
        while(s.hasNext()){
            builder.append(s.nextLine()).append("\n");
        }
        return builder.toString();
    }
    public static String streams(){
        String result = new BufferedReader(new InputStreamReader(getInputStream()))
                .lines().collect(Collectors.joining("\n"));
        return result;
    }
    public static String parallelStreams(){
        String result = new BufferedReader(new InputStreamReader(getInputStream())).lines()
                .parallel().collect(Collectors.joining("\n"));
        return result;
    }

    public static String inputStreamReader() throws Exception{
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder builder = new StringBuilder();
        Reader reader = new InputStreamReader(getInputStream(), "UTF-8");
        while(true) {
            int read = reader.read(buffer, 0, buffer.length);
            if (read < 0)
                break;
            builder.append(buffer, 0, read);
        }
        return builder.toString();
    }
    public static InputStream getInputStream() {
        InputStream inputstream = null;
        try {
            inputstream = new FileInputStream("D:\\work\\javaexamples\\src\\main\\java\\sample");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputstream;
    }
}
