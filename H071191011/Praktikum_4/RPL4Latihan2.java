import java.util.Scanner;

class RPL4Latihan2 {
	// Seorang pelatih Volly ingin menganalisa kemampuan timnya. Setiap
	// pemain pelatih tersebut selalu mencatat jumlah services, block, dan
	// smash yang dilakukan setiap anggota timnya dan jumlah services, block,
	// dan smash yang berhasil (mendapatkan point). Buatlah sebuah program
	// untuk menghitung persentase dari services, block, dan smash yang
	// berhasil dilakukan oleh tim tersebut.
	// Format Input:
	// Baris pertama adalah integer N yang menyatakan banyaknya pemain dalam
	// tim tersebut. Setiap pemain memiliki tiga baris inputan, secara berurut
	// yaitu:
	// * baris pertama, nama pemain (tanpa spasi)
	// * services, block, dan smash yang dilakukan, dipisahkan dengan spasi
	// * services, block, dan smash yang berhasil, dipisahkan dengan spasi.
	// Format Output:
	// Tampilkan persentase SBS keseluruhan tim.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// [0] = servis, [1] = block, [2] = smash
		int total[] = {0, 0, 0};
		int berhasil[] = {0, 0, 0};

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String nama = sc.next();

			// [0] = servis, [1] = block, [2] = smash
			int totalSBS[] = {0, 0, 0};

			for (int j = 0; j < 3; j++) {
				totalSBS[j] = sc.nextInt();
				total[j] += totalSBS[j];
			}
			for (int j = 0; j < 3; j++) {
				int k = sc.nextInt();
				if (k > totalSBS[j]) {
					System.out.println("Entah apa yang merasuki input " + nama);
					return;
				}
				berhasil[j] += k;	
			}
		}

		double persentaseServis = berhasil[0] * 100.0 / (total[0] * 1.0);
		double persentaseBlock = berhasil[1] * 100.0 / (total[1] * 1.0);
		double persentaseSmash = berhasil[2] * 100.0 / (total[2] * 1.0);
		System.out.printf("Servis: %.2f%%\n", persentaseServis);
		System.out.printf("Block: %.2f%%\n", persentaseBlock);
		System.out.printf("Smash: %.2f%%\n", persentaseSmash);
	}
}
