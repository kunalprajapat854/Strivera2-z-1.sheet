import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scanner.nextInt();

        System.out.println("Enter the second number :");
        int b = scanner.nextInt();
        int gcd = findGCD(a, b);
        System.out.println("GCD (HCF) :" + gcd);

    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return Math.abs(a);
    }

}
