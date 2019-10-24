import java.util.Scanner;

class RPL6Tugas2 {
	// Buatlah program untuk membuat matriks 4x4 yang berisikan karakter.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		String text = sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0)
				result += text.charAt(i);
			else
				result += ((int) text.charAt(i));
		}

		int resultLength = result.length();
		int amount = (int) Math.ceil(resultLength / 16.0);

		for (int i = 0, j = 0; i < 16; i++) {
			for (int l = 0; l < amount; l++) {
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
