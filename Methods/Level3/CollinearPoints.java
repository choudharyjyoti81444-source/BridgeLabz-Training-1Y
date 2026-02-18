package com.gla.Methods.Level3;
import java.util.Scanner;
public class CollinearPoints {
    public static boolean checkCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (y2 - y1) / (double)(x2 - x1);
        double slopeBC = (y3 - y2) / (double)(x3 - x2);
        double slopeAC = (y3 - y1) / (double)(x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean checkCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        if (checkCollinearBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are collinear by slope method");
        else
            System.out.println("Points are not collinear by slope method");

        if (checkCollinearByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are collinear by area method");
        else
            System.out.println("Points are not collinear by area method");
    }

}
