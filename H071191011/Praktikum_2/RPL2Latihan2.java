import java.util.Scanner;

class RPL2Latihan2 {
	// Buatlah program untuk menghitung durasi sebuah acara yang diketahui
	// waktu mulai dan waktu berakhirnya acara. Acara tersebut dapat
	// berlangsung paling lama 24 jam dan paling singkat 1 menit. Tampilkan
	// durasi acara dengan format hh:mm (jam dan menit)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Acara mulai
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int i1 = h1 * 60 + m1; // ubah "hh mm" ke menit

		// Acara berakhir
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int i2 = h2 * 60 + m2; // ubah "hh mm" ke menit

		// 24 jam = 1400 menit
		int diff = i1 > i2 ? (1440 - i1 + i2) : (i2 - i1);
		System.out.printf("%02d:%02d\n", diff / 60, diff % 60);
	}
}
