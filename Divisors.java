import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = scanner.nextInt();
        divisors(n);

    }

    public static void divisors(int n) {
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

            if (i != n / i) {
                System.out.print((n / i) + " ");
            }
        }
        System.out.println();

    }

}
