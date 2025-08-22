import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        System.out.println(countingNum(n));

    }

    public static int countingNum(int n) {
        n = Math.abs(n);
        return String.valueOf(n).length();
    }

}
