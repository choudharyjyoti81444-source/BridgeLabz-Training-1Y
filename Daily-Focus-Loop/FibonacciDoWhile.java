import java.util.Scanner;
public class FibonacciDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int i = 1;

        System.out.print("Fibonacci series: ");

        do {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
            i++;
        } while (i<=n);
    }
}