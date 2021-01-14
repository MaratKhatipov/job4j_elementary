package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FactorialTest {
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		int test = Factorial.calc(5);
		Assert.assertThat(test, is(120));
	}

	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		int test = Factorial.calc(0);
		Assert.assertThat(test, is(1));
	}
}