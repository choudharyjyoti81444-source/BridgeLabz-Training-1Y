package DailyFocusString;

import java.util.Scanner;
public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an 1st Element");
        String s1 = sc.next();

        System.out.println("Enter an 2nd Element");
        String s2 = sc.next();

        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
