package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

	@Test
	public void whenEndWithPrefixThenTrue() {
		char[] word = {'H', 'e', 'l', 'l', 'o'};
		char[] post = {'l', 'o'};
		boolean result = EndsWith.endsWith(word, post);
		assertThat(result, is(true));
	}

	@Test
	public void whenNotEndWithPrefixThenFalse() {
		char[] word = {'H', 'e', 'l', 'l', 'o'};
		char[] post = {'l', 'a'};
		boolean result = EndsWith.endsWith(word, post);
		assertThat(result, is(false));
	}

	@Test
	public void whenNotEndWithPrefixThenFalse1() {
		char[] word = {'D', 'o', 'g', 'o', 'v', 'o', 'r'};
		char[] post = {'o', 'v', 'o', 'l'};
		boolean result = EndsWith.endsWith(word, post);
		assertThat(result, is(false));
	}

	@Test
	public void whenNotEndWithPrefixThenTrue1() {
		char[] word = {'D', 'o', 'g', 'o', 'v', 'o', 'r', 'l', 'i', 'z', 'i', 'n', 'g', 'a'};
		char[] post = {'l', 'i', 'z', 'i', 'n', 'g', 'a'};
		boolean result = EndsWith.endsWith(word, post);
		assertThat(result, is(true));
	}
}
