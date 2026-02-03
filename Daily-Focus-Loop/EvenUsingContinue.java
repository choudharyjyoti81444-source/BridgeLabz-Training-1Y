import java.util.Scanner;

public class EvenUsingContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        System.out.println("Even numbers are:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;   
            }
            System.out.print(i + " ");
        }
    }
}