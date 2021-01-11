package ru.job4j.converter;

public class Converter {

	public static int rubleToEuro(int value) {

		return value / 70;
	}

	public static int rubleToDollar(int value) {

		return value / 60;
	}

	public static void main(String[] args) {
		int euro = Converter.rubleToEuro(3360);
		int dollar = Converter.rubleToDollar(3420);
		System.out.println("3360 rubles are " + euro + " euro.");
		System.out.println("3420 rubles are " + dollar + " dollar.");
	}
}
