package DailyFocusString;

import java.util.Scanner;
public class StringChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an Elements");
        String str = sc.nextLine();

        System.out.println("Enter a Position");
        int n = sc.nextInt();

        char ch = str.charAt(n);
        System.out.println(ch);
    }
}
