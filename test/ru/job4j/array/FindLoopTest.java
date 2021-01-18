package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

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
}