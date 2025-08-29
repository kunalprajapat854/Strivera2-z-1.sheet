import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you're name :");
        String name = scanner.nextLine();

        System.out.print("Enter the number of times to print :");

        int n = scanner.nextInt();
        scanner.close();

        recursionprint(n, name);

    }

    public static void recursionprint(int n, String name) {
        if (n <= 0)
            return;
        System.out.println(name);
        recursionprint(n - 1, name);

    }

}
