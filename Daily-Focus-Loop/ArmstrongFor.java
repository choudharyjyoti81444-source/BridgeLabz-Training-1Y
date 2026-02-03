import java.util.Scanner;
public class ArmstrongFor {
    public static void main(String[] args) {
        int num, temp, digit, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (temp = num; temp != 0; temp /= 10) {
            digit = temp % 10;
            sum += digit * digit * digit;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}