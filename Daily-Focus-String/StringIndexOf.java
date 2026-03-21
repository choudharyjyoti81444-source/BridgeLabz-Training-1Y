package DailyFocusString;

import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        System.out.println("Enter a Char");
        char ch = sc.next().charAt(0);
        System.out.println(str.indexOf(ch));
    }
}
