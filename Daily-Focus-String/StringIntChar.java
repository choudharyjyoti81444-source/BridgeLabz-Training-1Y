package DailyFocusString;

import java.util.Scanner;
public class StringIntChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = "ABC";
        str += "xyz" ;
        str += 'r';
        str += 10;
        System.out.println(str);
    }
}
