package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

	@Test
	public void whenP15K4ThenS9() {
		int inP = 15;
		int inK = 4;
		double expected = 9;
		double out = SqArea.square(inP, inK);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test

	public void whenP10K5ThenS3() {
		int inP = 10;
		int inK = 5;
		double expected = 3.47;
		double out = SqArea.square(inP, inK);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void whenP25K9ThenS14() {
		int inP = 25;
		int inK = 9;
		double expected = 14.06;
		double out = SqArea.square(inP, inK);
		Assert.assertEquals(expected, out, 0.01);
	}
}