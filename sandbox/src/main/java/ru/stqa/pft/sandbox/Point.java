package ru.stqa.pft.sandbox;

public class Point {

    double x1 = 5;
    double y1;

    double x2;
    double y2;


    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x1 = 5;
        p1.y1 = 3.12;

        Point p2 = new Point();
        p2.x2 = 32.11;
        p2.y2 = 15.5;

    System.out.println("The square root multiplication of two dots with coordinates: " + "A(" + (p1.x1) + ";" + (p1.y1) + ")" + " & " + "B(" + (p2.x2) + ";" + (p2.y2) + ")" + " equals to: " + distance(p1, p2));

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.x2 - p1.x1) * (p2.x2 - p1.x1)) + ((p2.y2 - p1.y1) * (p2.y2 - p1.y1)));

    }
}