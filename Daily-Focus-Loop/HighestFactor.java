import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int highestFactor = 1;

        for (int  i=n-1; i>=1; i--) {
            if (n%i==0) {
                highestFactor = i;
                break;
            }
        }

        System.out.println("Highest proper factor of " + n + " is: " + highestFactor);
    }
}
