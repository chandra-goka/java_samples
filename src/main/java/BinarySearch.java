import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int a[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  Size Of an Array");
        int n = s.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        display(a);
        sort(a);
        display(a);
        System.out.println("Key To Find : ");
        int key = s.nextInt();
        int pos = binarySearch(a, 0, n-1, key);
        System.out.println("Element found @ position : "+pos);
    }
    public static void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static int binarySearch(int a[], int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            }
            if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void display(int a[]) {
        System.out.println("Array Elements Are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
