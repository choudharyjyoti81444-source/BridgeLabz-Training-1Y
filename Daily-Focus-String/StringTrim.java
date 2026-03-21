package DailyFocusString;

import java.util.Scanner;
public class StringTrim{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Words: " +words.length);
    }
}
