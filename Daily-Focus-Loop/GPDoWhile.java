import java.util.Scanner;

public class GPDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int i = 0;
        int term = a;

        System.out.println("Geometric Progression:");
        if (n > 0) {
            do {
                System.out.print(term + " ");
                term = term * r;
                i++;
            } while (i < n);
        }
    }
}