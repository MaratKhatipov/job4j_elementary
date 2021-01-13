package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

	@Test
	public void whenFirstMax() {
		int result = MultiMax.max(15, 10, 5);
		Assert.assertThat(result, is(15));
	}

	@Test
	public void whenSecondMax() {
		int result = MultiMax.max(10, 150, 5);
		Assert.assertThat(result, is(150));
	}

	@Test
	public void whenThirdMax() {
		int result = MultiMax.max(5, 10, 115);
		Assert.assertThat(result, is(115));
	}

	@Test
	public void whenNumEquals() {
		int result = MultiMax.max(5, 5, 5);
		Assert.assertThat(result, is(5));
	}
}