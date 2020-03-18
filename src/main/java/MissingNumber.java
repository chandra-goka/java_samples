public class MissingNumber {

    public static void main(String[] args) {
        int[] number = {6, 3, 2, 4, 1};
        System.out.println("Missing Number is:" + getMissingNumber(number));
    }
    public static int getMissingNumber(int arr[])
    {
        int i, total;
        int n = arr.length;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= arr[i];
        return total;
    }
}

