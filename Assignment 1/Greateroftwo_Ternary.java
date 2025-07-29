import java.util.Scanner;

public class Greateroftwo_Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;

        System.out.println("Greater number is: " + max);

        scanner.close();
    }
}
