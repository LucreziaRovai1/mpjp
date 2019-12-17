package s055;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleTest {
	private Simple simple;

	@BeforeEach
	public void init() {
		simple = new Simple();
	}

	@Test
	public void negatePositive() {
		int value = 42;

		int result = simple.negate(value);

		assertThat(result, equalTo(-42));
	}

	@Test
	public void negateMaxInt() {
		int value = Integer.MAX_VALUE; // è il massimo numero rappresentabile

		int result = simple.negate(value);

		assertThat(result, equalTo(-2147483647));
	}

	@Test
	public void negateMinInt() {
		int value = Integer.MIN_VALUE;

		int result = simple.negate(value);

		assertThat(result, equalTo(Integer.MIN_VALUE));//non può andar bene perché prendendo nella categoria int il valore più piccolo, è più grande del massimo valore quindi è un'incongruenza.
	}
}
