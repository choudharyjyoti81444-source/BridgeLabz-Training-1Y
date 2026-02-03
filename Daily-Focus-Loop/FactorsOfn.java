import java.util.Scanner;

public class FactorsOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

      //  int highestFactor = 1;

        for (int  i=1; i<=n; i++) {
            if (n%i==0) 
            //    highestFactor = i;
           //     break;
        System.out.println("factors is: " +i);}
    }
}
