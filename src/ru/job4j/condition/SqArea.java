package ru.job4j.condition;

public class SqArea {
	public static double square(int p, int k) {

		return ((Math.pow(p,2)*k)/(4*(Math.pow((k+1),2))));
	}

	public static void main(String[] args) {
		double result1 = SqArea.square(15, 4);
		System.out.println(" p = 15, k = 4, s = 9, real = " + result1);
	}
}
