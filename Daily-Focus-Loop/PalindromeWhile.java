import java.util.Scanner;
public class PalindromeWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;   // original number save
        int rev = 0;      // reverse number

        while (num>0) {
            int digit = num%10;        // last digit nikalo
            rev = rev*10 + digit;      // reverse banao
            num = num/10;              // last digit hatao
        }

        if (temp==rev) {
            System.out.println("Palindrome number");}
        else {
            System.out.println("Not a palindrome");}
    }
}
