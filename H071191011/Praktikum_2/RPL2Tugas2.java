import java.util.Scanner;

class RPL2Tugas2 {
	// Buatlah program untuk menghitung
	// * Luas bangun datar
	// * Volume bangun ruang
	// inputan untuk mengisi rumus bisa mencakup bilangan bulat dan desimal,
	// bangun datar, dan bangun ruang berupa daftar yang dipilih dengan
	// bilangan bulat.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// 1 = Luas bangun datar
			// 2 = Volume bangun ruang
			System.out.println("** Menu **");
			System.out.println("1. Mencari luas bangun datar");
			System.out.println("2. Mencari volume bangun ruang");
			System.out.println("Input angka sesuai dengan menu yang diinginkan");
			int jenis = sc.nextInt();

			switch (jenis) {
				case 1: {
					// Bangun datar
					System.out.println("** Pilih Bangun Datar **");
					System.out.println("1. Persegi");
					System.out.println("2. Persegi Panjang");
					System.out.println("3. Segitiga");
					System.out.println("4. Lingkaran");
					System.out.println("5. Jajargenjang");
					System.out.println("6. Trapesium");
					System.out.println("7. Belah Ketupat");
					System.out.println("8. Layang-layang");
					System.out.println("Input angka sesuai dengan nomor diatas untuk memilih: ");
					int bangunDatar = sc.nextInt();

					switch (bangunDatar) {
						case 1: {
							// Persegi
							System.out.println("Input sisi");
							double sisi = sc.nextDouble();
							System.out.printf("Luas Persegi = %.3f\n", sisi * sisi);
							break;
						}
						case 2: {
							// Persegi Panjang
							System.out.println("Input panjang");
							double panjang = sc.nextDouble();
							System.out.println("Input lebar");
							double lebar = sc.nextDouble();
							System.out.printf("Luas Persegi Panjang = %.3f\n", panjang * lebar);
							break;
						}
						case 3: {
							// Segitiga
							System.out.println("Input alas");
							double alas = sc.nextDouble();
							System.out.println("Input tinggi");
							double tinggi = sc.nextDouble();
							System.out.printf("Luas Segitiga = %.3f\n", alas * tinggi / 2.0);
							break;
						}
						case 4: {
							// Lingkaran
							System.out.println("Input jari-jari");
							double jariJari = sc.nextDouble();
							System.out.printf("Luas Lingkaran = %.3f\n", Math.PI * jariJari * jariJari);
							break;
						}
						case 5: {
							// Jajargenjang
							System.out.println("Input alas");
							double alas = sc.nextDouble();
							System.out.println("Input tinggi");
							double tinggi = sc.nextDouble();
							System.out.printf("Luas Jajargenjang = %.3f\n", alas * tinggi);
							break;
						}
						case 6: {
							// Trapesium
							System.out.println("Input sisi A");
							double sisiA = sc.nextDouble();
							System.out.println("Input sisi B");
							double sisiB = sc.nextDouble();
							System.out.println("Input tinggi");
							double tinggi = sc.nextDouble();
							System.out.printf("Luas Trapesium = %.3f\n", (sisiA + sisiB) * tinggi / 2.0);
							break;
						}
						case 7:
						case 8: {
							// Belah Ketupat atau Layang-layang
							String jenisRuang = bangunDatar == 7 ? "Belah Ketupat" : "Layang-layang";
							System.out.println("Input diagonal 1");
							double d1 = sc.nextDouble();
							System.out.println("Input diagonal 2");
							double d2 = sc.nextDouble();
							System.out.printf("Luas %s = %.3f\n", jenisRuang, d1 * d2 / 2.0);
							break;
						}
						default:
							throw new RuntimeException("nomor bangun datar tidak valid");
					}

					break;
				}
				case 2: {
					// Bangun ruang
					System.out.println("** Pilih Bangun Ruang **");
					System.out.println("1. Kubus");
					System.out.println("2. Balok");
					System.out.println("3. Prisma Segitiga");
					System.out.println("4. Limas Segitiga");
					System.out.println("5. Limas Segiempat");
					System.out.println("6. Tabung");
					System.out.println("7. Kerucut");
					System.out.println("8. Bola");
					System.out.println("Input angka sesuai dengan nomor diatas untuk memilih: ");

					int bangunRuang = sc.nextInt();
					switch (bangunRuang) {
						case 1: {
							// Kubus
							System.out.println("Input sisi");
							double sisi = sc.nextDouble();
							System.out.printf("Volume Kubus = %.3f\n", sisi * sisi * sisi);
							break;
						}
						case 2: {
							// Balok
							System.out.println("Input panjang");
							double panjang = sc.nextDouble();
							System.out.println("Input lebar");
							double lebar = sc.nextDouble();
							System.out.println("Input tinggi");
							double tinggi = sc.nextDouble();
							System.out.printf("Volume Balok = %.3f\n", panjang * lebar * tinggi);
							break;
						}
						case 3: {
							// Prisma Segitiga
							System.out.println("Input alas segitiga pada tutup prisma");
							double alas = sc.nextDouble();
							System.out.println("Input tinggi segitiga pada tutup prisma");
							double tinggi = sc.nextDouble();
							double luasAlas = alas * tinggi / 2.0;
							System.out.println("Input tinggi prisma");
							double tinggiPrisma = sc.nextDouble();
							System.out.printf("Volume Prisma Segitiga = %.3f\n", luasAlas * tinggiPrisma);
							break;
						}
						case 4: {
							// Limas Segitiga
							System.out.println("Input alas segitiga pada alas limas");
							double alas = sc.nextDouble();
							System.out.println("Input tinggi segitiga pada alas limas");
							double tinggi = sc.nextDouble();
							double luasAlas = alas * tinggi / 2.0;
							System.out.println("Input tinggi limas");
							double tinggiLimas = sc.nextDouble();
							System.out.printf("Volume Limas Segitiga = %.3f\n", luasAlas * tinggiLimas / 3.0);
							break;
						}
						case 5: {
							// Limas Segiempat
							System.out.println("Input panjang alas limas");
							double panjang = sc.nextDouble();
							System.out.println("Input lebar alas limas");
							double lebar = sc.nextDouble();
							double luasAlas = panjang * lebar;
							System.out.println("Input tinggi limas");
							double tinggi = sc.nextDouble();
							System.out.printf("Volume Limas Segiempat = %.3f\n", luasAlas * tinggi / 3.0);
							break;
						}
						case 6: {
							// Tabung
							System.out.println("Input jari-jari lingkaran pada tutup prisma");
							double jariJari = sc.nextDouble();
							double luasAlas = Math.PI * jariJari * jariJari;
							System.out.println("Input tinggi");
							double tinggi = sc.nextDouble();
							System.out.printf("Volume Tabung = %.3f\n", luasAlas * tinggi);
							break;
						}
						case 7: {
							// Kerucut
							System.out.println("Input jari-jari lingkaran");
							double jariJari = sc.nextDouble();
							double luasAlas = Math.PI * jariJari * jariJari;
							System.out.println("Input tinggi");
							double tinggi = sc.nextDouble();
							System.out.printf("Volume Kerucut = %.3f\n", luasAlas * tinggi / 3.0);
							break;
						}
						case 8: {
							// Bola
							System.out.println("Input jari-jari");
							double r = sc.nextDouble();
							// (4/3) * pi * r^3
							System.out.printf("Volume Bola = %.3f\n", Math.PI * r * r * r * 4.0 / 3.0);
							break;
						}
						default:
							throw new RuntimeException("nomor bangun ruang tidak valid");
					}

					break;
				}
				default:
					throw new RuntimeException("nomor pilihan tidak valid");
			}
		} catch (Exception e) {
			String alasan = e.getMessage();
			if (alasan == null)
				alasan = "input bukan nomor";
			System.out.println("Input tidak valid: " + alasan);
		}
	}
}
