import java.util.Scanner;

public class Print10To1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // FOR LOOP
        System.out.println("\nUsing for loop:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("\nUsing while loop:");
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // DO-WHILE LOOP
        System.out.println("\nUsing do-while loop:");
        i = n;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }
}
