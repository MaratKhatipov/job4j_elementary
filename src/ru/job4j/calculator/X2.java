package ru.job4j.calculator;

public class X2 {
	public static  int calc(int a, int b, int c, int x) {
		return a * x * x + b * x + c;
	}

	public static void main(String[] args) {
		int result = X2.calc(10, 0, 0, 2);
	}
}
