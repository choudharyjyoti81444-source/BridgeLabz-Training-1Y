package DailyFocusString;

import java.util.Scanner;
public class StringToUpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        System.out.println(str.toUpperCase());
    }
}
