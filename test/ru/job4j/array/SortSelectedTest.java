package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
	@Test
	public void whenSort() {
		int[] input = new int[] {3, 4, 1, 2, 5};
		int[] result = SortSelected.sort(input);
		int[] expect = new int[] {1, 2, 3, 4, 5};
		assertThat(result, is(expect));
	}

	@Test
	public  void whenSort5() {
		int[] input = new int[] {3, 2, 1};
		int[] result = SortSelected.sort(input);
		int[] expect = new int[] {1, 2, 3};
		assertThat(result, is(expect));
	}

	@Test
	public  void whenSort10() {
		int[] input = new int[] {3, 2, 1, 0, 10, 15, 7, 8, -1, 4};
		int[] result = SortSelected.sort(input);
		int[] expect = new int[] {-1, 0, 1, 2, 3, 4, 7, 8, 10, 15};
		assertThat(result, is(expect));
	}
}