package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class ChessBoardTest {

	@Test
	public void wayTrue() {
		int way = ChessBoard.way(3, 7, 0, 4);
		Assert.assertThat(way, is(3));
	}

	@Test
	public void wayFalse00() {
		int way = ChessBoard.way(0, 0, 0, 0);
		Assert.assertThat(way, is(0));
	}

	@Test
	public void wayFalse() {
		int way = ChessBoard.way(3, 7, 0, 6);
		Assert.assertThat(way, is(0));
	}
}