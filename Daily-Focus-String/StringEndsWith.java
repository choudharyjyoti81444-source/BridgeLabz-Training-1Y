package DailyFocusString;
import java.util.Scanner;
public class StringEndsWith {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        System.out.println("Enter searching Element");
        String n = sc.nextLine();

        System.out.println(str.endsWith(n));
    }
}
