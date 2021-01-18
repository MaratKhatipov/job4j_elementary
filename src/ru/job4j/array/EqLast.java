package ru.job4j.array;

public class EqLast {
	public static boolean check(int[] left, int[] right) {
		for (int i = left.length - 1; i >= 0; i--) {
			for (int j = right.length - 1; j >= 0; j--) {
				if (left[left.length - 1] == right[right.length - 1]) {
					return true;
				}
			}
		}
		return false;
	}
}
