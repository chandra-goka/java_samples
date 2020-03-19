import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String a[]) {
        int remainder, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int input = sc.nextInt();
        int temp = input;
        while (input > 0) {
            remainder = input % 10;
            input = input / 10;
            sum = sum + (remainder * remainder * remainder);
        }
        if (sum == temp) {
            System.out.println("ArmStrong Number");
        } else {
            System.out.println("Not an ArmStrong Number");
        }

    }
}
