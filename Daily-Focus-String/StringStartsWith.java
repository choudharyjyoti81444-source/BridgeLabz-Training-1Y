package DailyFocusString;

import java.util.*;
public class StringStartsWith {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        System.out.println("Enter Searching Element");
        String n = sc.nextLine();

        System.out.println(str.startsWith(n));
    }
}
