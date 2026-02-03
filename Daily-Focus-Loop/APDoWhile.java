import java.util.Scanner;

public class APDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int i = 0;
        int term = a;

        System.out.println("Arithmetic Progression:");
        if (n > 0) {
            do {
                System.out.print(term + " ");
                term = term + d;
                i++;
            } while (i < n);
        }
    }
}
