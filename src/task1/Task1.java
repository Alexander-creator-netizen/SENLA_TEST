import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The task checks integers for parity.
 * It also determines whether the number is simple or composite.
 */
public class Task1 {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            int num = scan.nextInt();
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            String primeOrComposite;
            String oddOrEven;
            if (isPrime) {
                primeOrComposite = "prime";
            } else {
                primeOrComposite = "composite";
            }
            if (num % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
            System.out.println(num + " - " + primeOrComposite + ", " + oddOrEven + " number");

        } catch (InputMismatchException e) {
            System.out.println("Invalid data entered");
        }
    }
}

