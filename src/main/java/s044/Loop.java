package s044;

public class Loop {

	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4 };

		System.out.print('[');
		{

			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i]);

				if (i < data.length - 1) {
					System.out.print(',');
				}

			}
			System.out.println(']');

			System.out.print('[');
			{

				int i = 0;
				while (i < data.length) {
					System.out.print(data[i]);
					i++;

					if (i < data.length) {

						System.out.print(',');
					}

				}
				System.out.println(']');

				System.out.print('[');
				{

					for (int item : data) {
						System.out.print(item);

						System.out.print(',');
					}
					System.out.print(']');
				}
			}
		}
	}
}
