import java.util.Scanner;
public class ReverseNumberAllLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // FOR LOOP
        int rev1 = 0;
        for (int i1=num; i1!=0; i1/=10) {
            rev1 = rev1*10 + i1%10;
        }
        System.out.println("Reversed using for: " + rev1);

        // WHILE LOOP
        int i2 = num;
        int rev2 = 0;
        while (i2!=0) {
            rev2 = rev2*10 + i2%10;
            i2/=10;
        }
        System.out.println("Reversed using while: " + rev2);

        // DO-WHILE LOOP
        int i3 = num;
        int rev3 = 0;
        do {
            rev3 = rev3*10 + i3%10;
            i3/=10;
        } while (i3!=0);
        System.out.println("Reversed using do-while: " + rev3);
    }
}