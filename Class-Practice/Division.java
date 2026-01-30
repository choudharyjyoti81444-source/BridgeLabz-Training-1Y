import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (b != 0) {
            double result = a / b;
            System.out.println("Division = " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        sc.close();
    }
}
