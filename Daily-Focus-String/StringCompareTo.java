package DailyFocusString;

import java.util.Scanner;
public class StringCompareTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter str");
        String str = sc.nextLine();

        System.out.println("enter gtr");
        String gtr = sc.nextLine();

        System.out.println(str.compareTo(gtr));
    }
}
