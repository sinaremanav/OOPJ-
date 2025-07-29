import java.util.Scanner;

public class Greaterofthree_Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Nested ternary to find max of three
        int max = (a > b) 
                    ? (a > c ? a : c) 
                    : (b > c ? b : c);

        System.out.println("Greatest number is: " + max);

        scanner.close();
    }
}
