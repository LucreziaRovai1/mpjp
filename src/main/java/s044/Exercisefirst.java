package s044;

public class Exercisefirst {
	public static void main(String[] args) {
		int[] array = { 3, 5, 1, 7 };
		int min = array[0];

		for (int i = 1; i < 4; i++) {
			if (array[i] < min) {
				min = array[i];

			}

		}

		System.out.println(min);

	}

}
