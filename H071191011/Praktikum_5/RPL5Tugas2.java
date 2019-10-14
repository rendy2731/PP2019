import java.util.Scanner;
import java.util.Random;

class RPL5Tugas2 {
	static String generateSerial(int n, int m) {
		Random rng = new Random(System.currentTimeMillis());
		char sequence[] = new char[m * n + n - 1];
		int i = 0;

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < m; k++) {
				sequence[i++] = (char) (rng.nextInt(9) + '0');
			}

			if (j < n - 1) {
				sequence[i++] = '-';
			}
		}

		return new String(sequence);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String serialNumber = generateSerial(n, m);
		System.out.println(serialNumber);
	}
}
