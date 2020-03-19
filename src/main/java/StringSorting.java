import java.util.Scanner;

public class StringSorting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        String str[] = new String[n];
        System.out.println("Enter any " + n + " names");
        for (int i = 0; i < n; i++)
            str[i] = s.next();
        System.out.println("Before Sorting ");
        System.out.println("---------------");
        for (int i = 0; i < n; i++)
            System.out.println(str[i]);
        // Sorting
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (str[j].compareToIgnoreCase(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
        System.out.println("After Sorting");
        System.out.println("---------------");
        for (int i = 0; i < n; i++)
            System.out.println(str[i]);
    }
}
