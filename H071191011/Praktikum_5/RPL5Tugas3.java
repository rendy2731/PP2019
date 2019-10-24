import java.util.Scanner;

class RPL5Tugas3 {
	static void myDay(int hari) {
		int tahun, bulan;

		// Hitung tahun
		for (tahun = 0; hari >= 365; hari -= 365) {
			tahun++;
		}

		// Hitung bulan
		for (bulan = 0; hari >= 30; hari -= 30) {
			bulan++;
		}

		if (tahun > 0)
			System.out.println(tahun + " tahun");
		if (bulan > 0)
			System.out.println(bulan + " bulan");
		if (hari > 0)
			System.out.println(hari + " hari");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		myDay(days);
	}
}
