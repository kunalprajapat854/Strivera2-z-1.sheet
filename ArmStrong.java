import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        boolean isarmStrong = checkArmstrong(num);
        System.out.println(isarmStrong ? "Armstrong" : "No");
    }

    public static boolean checkArmstrong(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;

        }

        return original == sum;
    }

}
