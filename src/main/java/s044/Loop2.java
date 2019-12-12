package s044;

public class Loop2 {
	public static void main(String[] args) {
		int[] array = { 5, 7, 1, 3, 4 };
		boolean seven = false;
		boolean one = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				seven = true;

				System.out.println("1 è in posizione" + i);
			}

		}
		if (!seven) {
			System.out.println("not found 7");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				one = true;
				System.out.println("7 è in posizione" + i);

			}

		}
		if (!one) {
			System.out.println("not found 1");
		}
		{

		}
	}
}
