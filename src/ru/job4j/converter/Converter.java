package ru.job4j.converter;

public class Converter {

	public static int rubleToEuro(int value) {

		return value / 70;
	}

	public static int rubleToDollar(int value) {

		return value / 60;
	}

	public static void main(String[] args) {
//		int in = 3360;
//		int expected = 48;
//		int out = Converter.rubleToEuro(in);
//		boolean passed = expected == out;
//		System.out.println("3360 rubles are 48 euro. Test result : " + passed);
//
//		in = 3420;
//		expected = 57;
//		out = Converter.rubleToDollar(in);
//		passed = expected == out;
//		System.out.println("3420 rubles are 57 dollar. Test result : " + passed);
//		System.out.println();

		int euro = Converter.rubleToEuro(3360);
		int dollar = Converter.rubleToDollar(3420);
		System.out.println("3360 rubles are " + euro + " euro.");
		System.out.println("3420 rubles are " + dollar + " dollar.");
	}
}
