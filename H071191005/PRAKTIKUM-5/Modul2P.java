import java.util.Scanner;
import java.util.Random;

class Modul2P {
	static String generateSerial(int n, int m) {
		Random cs = new Random(System.currentTimeMillis());
		char usama[] = new char[m * n + n - 1];
		int i = 0;

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < m; k++) {
				usama[i++] = (char) (cs.nextInt(9) + '0');
			}

			if (j < n - 1) {
				usama[i++] = '-';
			}
		}

		return new String(usama);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String serialNumber = generateSerial(n, m);
		System.out.println(serialNumber);
	}
}