package ru.job4j.condition;

public class Max {
	public static int max(int left, int right) {
		boolean condition = left > right;
		return condition ? left : right;
	}

	public static int max(int left, int right, int third) {
		return  max(max(left, right), third);
	}

	public static int max(int left, int right, int third, int fourth) {
		return max(max(left, right, third), fourth);
	}

	public static void main(String[] args) {
		int maxNum = Max.max(1, 2, 3, 0);
		System.out.println(maxNum);
	}
}
