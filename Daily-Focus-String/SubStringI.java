package DailyFocusString;
 import java.util.Scanner;
public class SubStringI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an element");
        String str = sc.nextLine();

        System.out.println("Enter a postion");
        int n = sc.nextInt();
        System.out.println(str.substring(n));
    }
}
