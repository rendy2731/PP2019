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

		int banyakPemain = sc.nextInt();
		int totalServis = 0;
		int servisBerhasil = 0;
		int totalBlock = 0;
		int blockBerhasil = 0;
		int totalSmash = 0;
		int smashBerhasil = 0;

		for (int i = 0; i < banyakPemain; i++) {
			// Nama
			String nama = sc.next();
			int banyakServisPemain = sc.nextInt();
			int banyakBlockPemain = sc.nextInt();
			int banyakSmashPemain = sc.nextInt();

			int servisBerhasilPemain = sc.nextInt();
			if (servisBerhasilPemain > banyakServisPemain) {
				System.out.println("Entah apa yang merasuki banyak servis " + nama);
				return;
			}

			int blockBerhasilPemain = sc.nextInt();
			if (blockBerhasilPemain > banyakBlockPemain) {
				System.out.println("Entah apa yang merasuki banyak block " + nama);
				return;
			}

			int smashBerhasilPemain = sc.nextInt();
			if (smashBerhasilPemain > banyakSmashPemain) {
				System.out.println("Entah apa yang merasuki banyak smash " + nama);
				return;
			}

			totalServis += banyakServisPemain;
			totalBlock += banyakBlockPemain;
			totalSmash += banyakSmashPemain;
			servisBerhasil += servisBerhasilPemain;
			blockBerhasil += blockBerhasilPemain;
			smashBerhasil += smashBerhasilPemain;
		}

		double persentaseServis = servisBerhasil * 100.0 / (totalServis * 1.0);
		double persentaseBlock = blockBerhasil * 100.0 / (totalBlock * 1.0);
		double persentaseSmash = smashBerhasil * 100.0 / (totalSmash * 1.0);
		System.out.printf("Servis: %.2f%%\n", persentaseServis);
		System.out.printf("Block: %.2f%%\n", persentaseBlock);
		System.out.printf("Smash: %.2f%%\n", persentaseSmash);
	}
}
