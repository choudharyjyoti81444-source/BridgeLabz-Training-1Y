package DailyFocusString;

import java.util.Scanner;
public class ReverseStringBuilder {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Eneter an Element");
        String x = sc.nextLine();

        StringBuilder sb = new StringBuilder(x);
       // System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
