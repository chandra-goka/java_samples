import java.util.Scanner;

public class BubbleSort {
    int a[];
    int n;
    public BubbleSort(int size) {
        n = size;
        a = new int[n];
    }
    public void readArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
    }
    public void showArray() {
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
    }
    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("After " + (i + 1) + " Pass");
            showArray();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = s.nextInt();
        BubbleSort bubbleSort = new BubbleSort(n);
        bubbleSort.readArray();
        System.out.println("Before Bubble Sort");
        bubbleSort.showArray();
        bubbleSort.bubbleSort();
        System.out.println("After Bubble Sort");
        bubbleSort.showArray();
    }
}
