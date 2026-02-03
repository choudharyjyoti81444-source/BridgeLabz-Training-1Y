import java.util.Scanner;

public class EvenWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int i = 1;
        System.out.println("Even numbers are:");

        while (i <= n) {
            if (i % 2 != 0) {
                i++;
                continue;   // skip odd numbers
            }
            System.out.print(i + " ");
            i++;
        }
    }
}