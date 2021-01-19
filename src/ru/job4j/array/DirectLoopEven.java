package ru.job4j.array;

public class DirectLoopEven {
	public static void main(String[] args) {
		int[] evenArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < evenArray.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
