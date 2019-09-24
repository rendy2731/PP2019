import java.util.Scanner;

class RPL3Tugas4 {
	// Buatlah program untuk menghitung kembalian dari suatu transaksi.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input
		int barang = sc.nextInt();
		barang = (barang / 1000) * 1000;
		// Cek kenegatifitas
		if (barang <= 0) {
			System.out.println("Tidak ada barang gratis yang aman");
			return;
		}

		// Input
		int bayar = sc.nextInt();
		bayar = (bayar / 1000) * 1000;
		// Cek kenegatifitas
		if (bayar <= 0) {
			System.out.println("Tidak ada barang yang gratis -_-");
			return;
		}

		// Tidak boleh berhutang
		if (barang > bayar) {
			System.out.println("Tidak ada ngutang yang aman");
			return;
		}

		// Hitung kembalian
		int kembalian = bayar - barang;
		int kembali100K, kembali50K, kembali20K, kembali10K, kembali5K;
		int kembali2K, kembali1K;
		for (kembali100K = 0; kembalian >= 100000; kembali100K++) {
			kembalian -= 100000;
		}
		for (kembali50K = 0; kembalian >= 50000; kembali50K++) {
			kembalian -= 50000;
		}
		for (kembali20K = 0; kembalian >= 20000; kembali20K++) {
			kembalian -= 20000;
		}
		for (kembali10K = 0; kembalian >= 10000; kembali10K++) {
			kembalian -= 10000;
		}
		for (kembali5K = 0; kembalian >= 5000; kembali5K++) {
			kembalian -= 5000;
		}
		for (kembali2K = 0; kembalian >= 2000; kembali2K++) {
			kembalian -= 2000;
		}
		for (kembali1K = 0; kembalian >= 1000; kembali1K++) {
			kembalian -= 1000;
		}

		// Out
		System.out.println(kembali100K + " uang Rp.100.000");
		System.out.println(kembali50K + " uang Rp.50.000");
		System.out.println(kembali20K + " uang Rp.20.000");
		System.out.println(kembali10K + " uang Rp.10.000");
		System.out.println(kembali5K + " uang Rp.5.000");
		System.out.println(kembali2K + " uang Rp.2.000");
		System.out.println(kembali1K + " uang Rp.1.000");
	}
}
