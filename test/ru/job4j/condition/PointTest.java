package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

	@Test
	public void when210to2010Then11() {
		int inX1 = 2;
		int inY1 = 2;
		int inX2 = 10;
		int inY2 = 10;
		double expected = 11.31;
		double out = Point.distance(inX1, inY1, inX2, inY2);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when00to20Then2() {
		int inX1 = 0;
		int inY1 = 0;
		int inX2 = 2;
		int inY2 = 0;
		double expected = 2;
		double out = Point.distance(inX1, inY1, inX2, inY2);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when11to23Then1() {
		int inX1 = 1;
		int inY1 = 2;
		int inX2 = 1;
		int inY2 = 3;
		double expected = 1;
		double out = Point.distance(inX1, inY1, inX2, inY2);
		Assert.assertEquals(expected, out, 0.01);
	}
}