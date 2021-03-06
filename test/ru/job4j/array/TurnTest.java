package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		int[] input = new int[]{4, 1, 6, 2};
		int[] result = Turn.back(input);
		int[] expect = new int[]{2, 6, 1, 4};
		assertThat(result, is(expect));
	}

	@Test
	public void whenTurnArrayWithUnevenAmountOfElementsThenTurnedArray() {
		int[] input = new int[]{4, 1, 6, 2, 0};
		int[] result = Turn.back(input);
		int[] expect = new int[]{0, 2, 6, 1, 4};
		assertThat(result, is(expect));
	}
}


