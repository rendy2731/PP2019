import java.util.Scanner;

class RPL3Tugas6 {
	// Cari bilangan faktor dengan cara cepat
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		if (n <= 1) {
			System.out.println("Tidak ada nilai yang aman");
			return;
		}

		// Setiap bilangan non-prima setidaknya memiliki faktor
		// diantara [2, sqrt(n)]
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(n + " bukan bilangan prima");
				return;
			}
		}

		System.out.println(n + " bilangan prima");
	}
}
