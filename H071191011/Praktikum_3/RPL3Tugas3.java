import java.util.Scanner;

class RPL3Tugas3 {
	// Sebuah himpunan disebut himpunan A.
	// Misal A = {0, 1, 1, 2, 3, 5, 8, 13, ..., n}. A adalah himpunan yang
	// anggotanya dimulai dari 0 dan 1, kemudian angka berikutnya adalah
	// jumlah dari 2 angka sebelumnya
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1;

		int x = sc.nextInt();
		if (x <= 0) {
			System.out.println("Tidak ada input yang aman");
			return;
		}

		for (int i = 0; i < x; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
