import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Arithmetic Progression:");
        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }        
    }
}
