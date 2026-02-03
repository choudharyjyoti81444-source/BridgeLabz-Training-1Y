import java.util.Scanner;
public class ArmstrongDoWhile {
    public static void main(String[] args) {
        int num, temp, digit, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;
        do {
            digit = temp%10;
            sum += digit*digit*digit;
            temp /= 10;
        } while (temp != 0);

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
