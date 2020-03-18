import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = scan.nextInt();
        System.out.println("Enter the shifts you want to move: ");
        int shifts = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; ++i) {
            array[i] = scan.nextInt();
        }
        for (int i=0; i<shifts; ++i) {
            rotateArray(array);
        }
        System.out.println("Output:");
        for (int a : array) {
            System.out.print(a+" ");
        }
    }

    public static void rotateArray(int[] arr){
        int firstElement = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
    }
}
