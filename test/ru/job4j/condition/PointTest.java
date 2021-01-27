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
		Point a = new Point(inX1, inY1);
		Point b = new Point(inX2, inY2);
		double out = a.distance(b);
		double expected = 11.31;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when00to20Then2() {
		int inX1 = 0;
		int inY1 = 0;
		int inX2 = 2;
		int inY2 = 0;
		Point a = new Point(inX1, inY1);
		Point b = new Point(inX2, inY2);
		double out = a.distance(b);
		double expected = 2;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when11to23Then1() {
		int inX1 = 1;
		int inY1 = 2;
		int inX2 = 1;
		int inY2 = 3;
		Point a = new Point(inX1, inY1);
		Point b = new Point(inX2, inY2);
		double out = a.distance(b);
		double expected = 1;
		Assert.assertEquals(expected, out, 0.01);
	}
}