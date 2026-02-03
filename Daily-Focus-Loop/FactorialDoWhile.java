import java.util.Scanner;
public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
		
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);

        System.out.println("Factorial = " + fact);
    }
}
