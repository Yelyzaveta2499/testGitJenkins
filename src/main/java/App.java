import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (or leave blank): ");
        String firstLine = scanner.nextLine();
        Integer a = Integer.parseInt(firstLine);

        System.out.print("Enter second number (or leave blank): ");
        String secondLine = scanner.nextLine();
        Integer b = Integer.parseInt(secondLine);

        try {
            int result = add(a, b);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();


        System.out.println(add(1, 1));
    }

    // Add: simple method to calculate sum of two integers
    public static int add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments must not be null");
        }

        return a + b;
    }
}
