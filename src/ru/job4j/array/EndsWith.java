package ru.job4j.array;

public class EndsWith {
	public static boolean endsWith(char[] word, char[] post) {
		boolean result = true;
		for (int i = (word.length - post.length); i < word.length; i++) {

				if (post[i - (word.length - post.length)] == word[i]) {
					result = true;

				} else {
					result = false;
				}

		}
		return result;
	}
}
