package DailyFocusString;

import java.util.Scanner;
public class FirstNonRepeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;

            for(int j=0; j<str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First non-repeating: " +ch);
                return;
            }
        }
        System.out.println("No unique character");
    }
}
