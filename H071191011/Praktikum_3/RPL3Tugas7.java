import java.util.Scanner;

class RPL3Tugas7 {
	// Buatlah program matrix, contoh untuk 3x3
	// 1 3 1
	// 2 2 2
	// 3 1 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Tidak ada input yang aman");
			return;
		}
		// Hitung panjang input integer
		// https://www.baeldung.com/java-number-of-digits-in-int
		int intLength = 1;
		for (long temp = 1; temp <= n; temp *= 10) {
			intLength++;
		}
		
		// Format printf
		String format = "%-" + intLength + "d";
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf(format, j % 2 == 0 ? i : (n - i + 1));
			}
			System.out.println();
		}
	}
}
