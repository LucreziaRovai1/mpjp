package ex;

//import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.junit.jupiter.api.Test;

class S59Test {

	@Test
	void sumPositive() {
		long actual = S59.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumPositive1() {
		long actual = S59.sum(2_000_000_000, 2_000_000_001);

		assertThat(actual, is(4_000_000_001L));
	}

	@Test
	void sumNegPos() {
		long actual = S59.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S59.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S59.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S59.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S59.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S59.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S59.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S59.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S59.factorial(-4);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacci() {
		long actual = S59.fibonacci(8);
		assertThat(actual, is(21L));
	}

	@Test
	void multiplicationTablePlain() { // plain mi ricorda che non è un caso limite, sto facendo un test semplice
		int[][] actual = S59.multiplicationTable(3);

		int[][] expected = { // facendo ctrl shift F se metto un commento a fine riga non mi allinea,
				{ 1, 2, 3 }, // perché voglio che rimangano incolonnati, lo capisco di più
				{ 2, 4, 6 }, //
				{ 3, 6, 9 } //
		};

		assertEquals(expected.length, actual.length); // asserisco che c'è un'uguaglianza tra la lunghezza dell'array
														// expected e quella di actual.
		// il mio array è un array di interi, ecco perché è bidimensionale. se voglio
		// sapere la lunghezza di actual voglio sapere quante righe ha. In questo caso
		// 3.

		for (int i = 0; i < expected.length; i++) { // per tutte le righe di expected voglio verificare che la
			assertEquals(expected[i].length, actual[i].length);									// dimensione sia quella che mi aspetto.
													// i in questo caso mi rappresenta la riga corrente
													// il numero di colonne deve essere uguale per ogni riga

		}
		for (int i = 0; i < expected.length; i++) {
			for (int j = 0; j < expected.length; j++) {
				assertEquals(expected[i][j], actual[i][j]);

			}
		}
	}
}
