import java.util.Scanner;

class RPL6Tugas2 {
	// Buatlah program untuk membuat matriks 4x4 yang berisikan karakter.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		String text = sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0)
				builder.append(text.charAt(i));
			else
				builder.append((int) text.charAt(i));
		}

		String result = builder.toString();
		int resultLength = result.length();
		int banyak = (int) Math.ceil(resultLength / 16.0);

		for (int i = 0, j = 0; i < 16; i++) {
			for (int l = 0; l < banyak; l++) {
				if (j < resultLength)
					System.out.print(result.charAt(j++));
				else
					System.out.print('?');
			}

			if (i % 4 == 3)
				System.out.println();
			else
				System.out.print(' ');
		}
	}
}
