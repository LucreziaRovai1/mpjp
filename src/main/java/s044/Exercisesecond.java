package s044;

public class Exercisesecond {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8 };
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				++counter;
			}
		}

		System.out.println(counter+1);

	}

}
