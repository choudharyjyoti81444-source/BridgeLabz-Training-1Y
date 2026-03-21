package DailyFocusString;

import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element ");
        String str = sc.nextLine();

        str = str.replaceAll(" ","");

        System.out.println("Result: " +str);
    }
}
