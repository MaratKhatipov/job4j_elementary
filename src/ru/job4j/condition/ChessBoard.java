package ru.job4j.condition;

public class ChessBoard {
	public static int way(int x1, int y1, int x2, int y2) {
		int result = 0;
		if (x1 == x2 || y1 == y2) {
			return result;
		}
		result = (Math.abs(x2 - x1)) == (Math.abs(y2 - y1)) ? (Math.abs(y2 - y1)) : result;
		return result;
	}

	public static void main(String[] args) {
		int check = ChessBoard.way(3, 7, 0, 4);
		System.out.println(check);
	}
}
