package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArray2Test {

	@Test
	public void whenSwap5To2() {
		int[] input = {0, 1, 2, 3, 4, 5};
		int source = 5;
		int dest = 2;
		int[] expect = {0, 1, 5, 3, 4, 2};
		int[] rsl = SwitchArray2.swap(input, source, dest);
		assertThat(rsl, is(expect));
	}

	@Test
	public void whenSwap0to3() {
		int[] input = {1, 2, 3, 4};
		int[] expect = {4, 2, 3, 1};
		int[] rsl = SwitchArray2.swap(input, 0, input.length - 1);
		assertThat(rsl, is(expect));
	}

	@Test
	public void swapBorderReplaceFirstLast() {
		int[] input = {0, 1, 2, 3, 4, 5, 6};
		int[] expect = {6, 1, 2, 3, 4, 5, 0};
		int[] rsl = SwitchArray2.swapBorder(input);
		assertThat(rsl, is(expect));
	}
}