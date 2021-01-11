package ru.job4j.condition;

public class TrgArea {

	public static double area(double a, double b, double c) {
		double semiPerimeter = (a + b + c) / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
	}

	public static void main(String[] args) {

		double areaOfTriangle = TrgArea.area(15, 10, 20);
		System.out.println("area (15, 10, 20) = " + areaOfTriangle);
	}

}
