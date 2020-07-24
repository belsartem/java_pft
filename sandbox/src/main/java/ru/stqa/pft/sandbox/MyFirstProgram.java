package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
		hello("world");
		hello("user");
		hello("Artem");

		double l = 5;
		System.out.println("Square area with a side " + l + " = " + area(l));

		double a = 4;
		double b = 6;
		System.out.println("Rectangle area with sides " + a + " and " + " = " + area(a, b));

	}

	public static void hello(String somebody){
		System.out.println("Hello " + somebody + "!");
	}

	public static double area(double len) {
		return len * len;
	}

	public static double area(double a, double b){
		return a * b;
	}

}