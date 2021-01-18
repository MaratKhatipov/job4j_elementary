package ru.job4j.array;

public class EndsWith {
	public static boolean endsWith(char[] word, char[] post) {
		boolean result = true;
		for (int i = (word.length - post.length); i < word.length; i++) {
			for (int j = 0; j < post.length; j++) {

				if (post[j] == word[i]) {
					result = true;

				} else {
					result = false;
				}
			}
		}
		return result;
	}
}
