package DailyFocusString;

import java.util.Scanner;
public class StringSplit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.print("Words: " +words.length);
    }
}
