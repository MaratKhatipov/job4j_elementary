package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

	@Test
	public void skip() {
		int[][] input = {
				{1, -2},
				{1, 2}
		};
		int[][] expect = {
				{1, 0},
				{1, 2}
		};
		int[][] result = SkipNegative.skip(input);
		assertThat(result, is(expect));
	}

}