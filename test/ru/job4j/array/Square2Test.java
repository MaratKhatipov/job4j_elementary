package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Square2Test {

	@Test
	public void whenBound5Then014916() {
		int bound = 5;
		int[] rst = Square2.calculate(bound);
		int[] expected = new int[] {0, 1, 4, 9, 16};
		assertThat(rst, is(expected));
	}
}