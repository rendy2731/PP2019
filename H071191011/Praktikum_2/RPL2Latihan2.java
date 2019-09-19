import java.util.Scanner;

class RPL2Latihan2 {
	// Buatlah program untuk menghitung durasi sebuah acara yang diketahui
	// waktu mulai dan waktu berakhirnya acara. Acara tersebut dapat
	// berlangsung paling lama 24 jam dan paling singkat 1 menit. Tampilkan
	// durasi acara dengan format hh:mm (jam dan menit)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Acara mulai
			int h1 = sc.nextInt();
			if (h1 < 0 || h1 > 23)
				throw new RuntimeException("input jam pertama diluar rentang");
			int m1 = sc.nextInt();
			if (m1 < 0 || m1 > 59)
				throw new RuntimeException("input menit pertama diluar rentang");
			int i1 = h1 * 60 + m1; // ubah "hh mm" ke menit

			// Acara berakhir
			int h2 = sc.nextInt();
			if (h2 < 0 || h2 > 23)
				throw new RuntimeException("input jam kedua diluar rentang");
			int m2 = sc.nextInt();
			if (m2 < 0 || m2 > 59)
				throw new RuntimeException("input menit kedua diluar rentang");
			int i2 = h2 * 60 + m2; // ubah "hh mm" ke menit

			// 24 jam = 1440 menit
			int diff;
			if (i1 > i2)
				// 1440 - (i1 - i2)
				diff = 1440 - i1 + i2;
			else
				diff = i2 - i1;

			// Output
			System.out.printf("%02d:%02d\n", diff / 60, diff % 60);
		} catch (Exception e) {
			String cause = e.getMessage();
			if (cause == null)
				cause = "input bukan nomor";

			System.out.println("Input tidak valid");
			System.out.println("Penyebab: " + cause);
		}
	}
}
