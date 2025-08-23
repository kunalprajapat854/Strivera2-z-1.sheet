import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        boolean ispalindrome = checkPalindrom(num);
        System.out.println(ispalindrome ? "Palindrome" : "Not a Palindrome");

    }

    public static boolean checkPalindrom(int n) {
        if (n < 0)
            return false;
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;

        }
        return original == reversed;
    }
}
