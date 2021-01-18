package ru.job4j.array;

public class ArrayDefinition3 {
	public static void main(String[] args) {
		short[] ages = new short[10];
		System.out.println("Размер массива равен: " + ages.length);
		String[] surnames = new String[100500];
		System.out.println("Размер массива равен: " + surnames.length);
		float[] prices = new float[40];
		System.out.println("Размер массива равен: " + prices.length);

		String[] names = new String[4];
		names[0] = "Khatipov Marat";
		names[1] = "Che Gevara";
		names[2] = "Ivan Petrov";
		names[3] = "Petr Ivanov";
		System.out.println("Значение массива names[0]: " + names[0]);
		System.out.println("Значение массива names[1]: " + names[1]);
		System.out.println("Значение массива names[2]: " + names[2]);
		System.out.println("Значение массива names[3]: " + names[3]);
	}
}
