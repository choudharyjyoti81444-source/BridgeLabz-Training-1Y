package DailyFocusString;

import java.util.Scanner;
public class InsertBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element:");
        String x = sc.nextLine();

        System.out.println("Enter index:");
        int y = sc.nextInt();

        System.out.println("Enter updating Element");
        char z = sc.next().charAt(0);

        System.out.println("Enter Insert Element:");
        char k = sc.next().charAt(0);

        StringBuilder str = new StringBuilder(x);
        System.out.println("Before: " +str);

        str.setCharAt(y,z);
        System.out.println("After: " +str);

        str.insert(y,k);
        System.out.println("Result: " +str);
    }
}
