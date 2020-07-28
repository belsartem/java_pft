package ru.stqa.pft.sandbox;

public class Point {

    public static void main(String[] args) {

        PointOne p1 = new PointOne(5, 3.12);
        PointTwo p2 = new PointTwo(32.11, 15.5);

        System.out.println("The square root multiplication of two dots with coordinates: " + "A(" + (p1.x1) + ";" + (p1.y1) + ")" + " & " + "B(" + (p2.x2) + ";" + (p2.y2) + ")" + " equals to: " + distance(p1, p2));

    }

    public static double distance(PointOne p1, PointTwo p2) {
        return Math.sqrt(((p2.x2 - p1.x1) * (p2.x2 - p1.x1)) + ((p2.y2 - p1.y1) * (p2.y2 - p1.y1)));
    }
}