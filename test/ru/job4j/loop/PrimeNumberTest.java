package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

	@Test
	public void when5Then3() {
		int count = PrimeNumber.calc(5);
		assertThat(count, is(3));
	}

	@Test
	public void when11Then5() {
		int count = PrimeNumber.calc(11);
		assertThat(count, is(5));
	}

	@Test
	public void when2Then1() {
		int count = PrimeNumber.calc(2);
		assertThat(count, is(1));
	}

	@Test
	public void when47Then15() {
		int count = PrimeNumber.calc(47);
		assertThat(count, is(15));
	}
}