package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MaxTest {

	@Test
	public void whenMax1To2Then2() {
	int result = Max.max(10, 15);
	Assert.assertThat(result, is(15));
	}

	@Test
	public void whenMax2To1Then1() {
	int result = Max.max(15, 10);
	Assert.assertThat(result, is(15));
	}

	@Test
	public void whenMax1To1Then1() {
	int result = Max.max(15, 15);
	Assert.assertThat(result, is(15));
	}

	@Test
	public void whenMax1To2To3Then3() {
		int result = Max.max(10, 20, 60);
		Assert.assertThat(result, is(60));
	}

	@Test
	public void whenMax1To2To3To4Then1() {
		int result = Max.max(15, 10, 1, 9);
		Assert.assertThat(result, is(15));
	}

	@Test
	public void whenEquals() {
		int result = Max.max(15, 15, 15, 15);
		Assert.assertThat(result, is(15));
	}
}