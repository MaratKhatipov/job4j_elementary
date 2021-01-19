package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

	@Test
	public void whenArrayHas5Then0() {
		int[] input = {5, 4, 3, 2};
		int value = 5;
		int result = FindLoop.indexOf(input, value);
		int expected = 0;
		assertThat(result, is(expected));
	}

	@Test
	public void whenArrayHasThenMinus1() {
		int[] input = {5, 4, 3, 2};
		int value = 7;
		int result = FindLoop.indexOf(input, value);
		int expected = -1;
		assertThat(result, is(expected));
	}

	@Test
	public void whenFind4() {
		int[] input = new int[] {5, 2, 10, 2, 4};
		int value = 4;
		int start = 2;
		int finish = 4;
		int result = FindLoop.indexOf(input, value, start, finish);
		int expect = 4;
		assertThat(result, is(expect));
	}

	@Test
	public void whenNotFind() {
		int[] input = new int[] {5, 2, 10, 2, 4, 8, 37};
		int value = 3;
		int start = 1;
		int finish = 5;
		int result = FindLoop.indexOf(input, value, start, finish);
		int expect = -1;
		assertThat(result, is(expect));
	}
}