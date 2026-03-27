package DailyFocusString;

import java.util.Scanner;
public class Builder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String x = sc.nextLine();

        System.out.println("Enter second string:");
        String y = sc.nextLine();

        StringBuilder str = new StringBuilder(x);
        str.append(y);
        System.out.println("Result:" +str);
    }
}
