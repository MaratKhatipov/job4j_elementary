package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

	@Test
	public void whenConvert3360then48() {
		int in = 3360;
		int expected = 48;
		int out = Converter.rubleToEuro(in);
		Assert.assertEquals(expected, out);
	}

	@Test
	public void whenConvert3420then57() {
		int in = 3420;
		int expected = 57;
		int out = Converter.rubleToDollar(in);
		Assert.assertEquals(expected, out);
	}
}