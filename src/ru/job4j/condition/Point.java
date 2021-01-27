package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	private int x;
	private int y;
	private int z;

	public Point(int first, int second) {
		this.x = first;
		this.y = second;
	}

	public Point(int firstPoint, int secondPoint, int thirdPoint) {
		this.x = firstPoint;
		this.y = secondPoint;
		this.z = thirdPoint;
	}

	public  double distance(Point that) {
		return sqrt(powTmp(this.x, that.x) + powTmp(this.y, that.y));
	}
	/*
	Added an additional method that
	calculates the square of the sum
	 */

	public double powTmp(double t1, double t2) {
		return pow((t2 - t1), 2);
	}

	public double distance3D(Point that) {
		double tmp = powTmp(this.x, that.x) + powTmp(this.y, that.y) + powTmp(this.z, that.z);
		return Math.sqrt(tmp);
	}
}
