package ex;

public class S59 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {

		long result = 0;

		if (first > last) {
			return 0;
		}

		for (int cur = first; cur <= last; cur++) {
			result += cur;
		}
		return result;

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long result = 0;

		if (first > last) {
			return 0;
		}

		for (int cur = first; cur <= last; cur++) {
			if (cur % 2 == 0) {
				result += cur;
			}
		}
		return result;

	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {

		long result = 1;

		if (value < 0) {
			return 0;
		} else {

			for (int cur = 1; cur <= value; cur++) {
				result *= cur;
			}
			return result;
		}

	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

		if (value < 0) {
			return 0;
		} else if (value == 1 || value == 2) {
			return 1;
		}
		long current = 2;
		long prev = 1;

		for (int i = 4; i <= value; i++) {
			long temp = current;
			current += prev;
			prev = temp;
		}
		return current;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];

		for (int i = 0; i < value; i++) {// per ogni riga scandisci le colonne. i e j rappresentano l'indirizzo ogni volta di una cella diversa.
			for (int j = 0; j < value; j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}
		return result;
	}
}
