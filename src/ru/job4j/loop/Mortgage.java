package ru.job4j.loop;

public class Mortgage {
	public static int year(int amount, int salary, double percent) {
		int year = 0;
		int debt;
		while (amount >= 0) {
			debt =  (amount + (int) (amount * percent / 100));
			amount = debt - salary;
			year++;
			}
		return year;
	}
}
// где amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.