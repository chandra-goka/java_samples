import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Word : ");
        String input = sc.nextLine();
        System.out.println("Reverse is : "+reverse(input));
    }
    public static String reverse(String input) {
        String reverse = null;
        char[] data = null;
        try {
            if (input != null) {
                data = input.toCharArray();
                int start = 0;
                int end = input.length() - 1;
                while (start < end) {
                    data[start] ^= data[end];
                    data[end] ^= data[start];
                    data[start] ^= data[end];
                    ++start;
                    --end;
                }
                reverse = String.valueOf(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            data = null;
        }
        return reverse;
    }

}
