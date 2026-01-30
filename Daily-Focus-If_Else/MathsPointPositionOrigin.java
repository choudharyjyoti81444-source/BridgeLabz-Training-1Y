import java.util.Scanner;
class MathsPointPositionOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coodinate (x y)");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Point is at the Origin");
        else if (x == 0)
            System.out.println("Point lies on Y-axis");
        else if (y == 0)
            System.out.println("Point lies on X-axis");
        else
            System.out.println("Point lies neither on X-axis nor Y-axis");
    }
}