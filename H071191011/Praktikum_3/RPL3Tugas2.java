import java.util.Scanner;

class RPL3Tugas2 {
	// Buatlah program yang mencetak angka sebanyak N pada baris horizontal
	// sebanyak M (N < M).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); // N
		int y = sc.nextInt(); // M

		// Harus memenuhi N < M
		if (x >= y) {
			System.out.println("Tidak ada input yang aman");
			return;
		}

		for (int i = 1; i <= y; i += x) {
			for (int j = 0; j < x; j++) {
				System.out.printf("%-4d", i + j);
			}
			System.out.println();
		}
	}
}
