package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        double x1 = 5;
        double x2 = 3.12;
        double y1 = 32.11;
        double y2 = 15.5;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.println("Distance between two dots with coordinates: " + "A(" + x1 + ";" + y1 + ")" + " & " + "B(" + x2 + ";" + y2 + ") " + "equals to: " + distance(p1, p2));
        System.out.println("Distance between two dots with coordinates: " + "A(" + p1.x + ";" + p1.y + ")" + " & " + "B(" + p2.x + ";" + p2.y + ") " + "equals to: " + p1.distance(p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }
}