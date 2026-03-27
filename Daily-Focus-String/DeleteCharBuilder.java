package DailyFocusString;

import java.util.Scanner;
public class DeleteCharBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element:");
        String x = sc.nextLine();

        System.out.println("Enter an Index: ");
        int y = sc.nextInt();

        System.out.println("Enter updating Element:");
        char z = sc.next().charAt(0);

        System.out.println("Enter an Insert Element");
        char k = sc.next().charAt(0);

        System.out.println("Enter Deleting index");
        int j = sc.nextInt();

        StringBuilder str = new StringBuilder(x);
        System.out.println("Before: " +str);

        str.setCharAt(y,z);
        System.out.println("After: " +str);

        str.insert(y,k);
        System.out.println("After Insert: " +str);

        str.deleteCharAt(j);
        System.out.println("Result: " +str);
    }
}
