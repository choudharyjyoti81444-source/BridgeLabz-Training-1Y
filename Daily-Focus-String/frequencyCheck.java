package DailyFocusString;

import java.util.Scanner;
public class frequencyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            boolean flag = false;
            for (int k = 0; k < i; k++) {
                if (ch == str.charAt(k)) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch+ "-->" +count);
        }
    }
}