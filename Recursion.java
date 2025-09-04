import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(1, n);

    }

    public static void printNumbers(int start, int n) {
        if (start > n)
            return;
        printNumbers(start + 1, n);
    }

}
