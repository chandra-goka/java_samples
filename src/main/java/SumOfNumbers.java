import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number, sum = 0, rem;
        System.out.print("Enter any number:");
        number = sc.nextLong();
        while (number >= 10) {
            sum = 0;
            while (number != 0) {
                rem = number % 10;
                number = number / 10;
                sum += rem;
            }
            if (sum >= 10) {
                number = sum;
            } else {
                break;
            }
        }
        System.out.println("Sum of Digits : " + sum);

    }
}
