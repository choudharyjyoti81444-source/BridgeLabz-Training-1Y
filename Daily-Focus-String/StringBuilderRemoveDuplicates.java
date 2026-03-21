package DailyFocusString;

import  java.util.Scanner;
public class StringBuilderRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.append(ch);
            }
        }

        System.out.println("Result: " + result);
    }
}
