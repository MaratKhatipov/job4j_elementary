package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TriangleTest {

	@Test
	public void whenAb2Ac2Bc2() {
		double ab = 2;
		double ac = 2;
		double bc = 2;
		boolean result = Triangle.exist(ab, ac, bc);
		Assert.assertThat(result, is(true));
	}

	@Test
	public void whenAb2Ac2Bc5() {
		double ab = 5;
		double ac = 2;
		double bc = 2;
		boolean result = Triangle.exist(ab, ac, bc);
		Assert.assertThat(result, is(false));
	}
}