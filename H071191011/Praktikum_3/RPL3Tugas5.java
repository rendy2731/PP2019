import java.util.Locale;
import java.util.Scanner;

class RPL3Tugas5 {
	// 1 hari sama dengan 24 jam. Nah bagaimana jika 1 hari disamadengankan
	// dengan 360 derajat. Maka cetak nilai n (dalam derajat) kedalam bentuk
	// satuan jam yaitu HH:MM:SS. Dengan nilai 0 derajat sama dengan jam
	// 06:00:00 dan seterusnya.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Agar pemisah koma adalah titik (0.9, 0.8, ...)
		// https://stackoverflow.com/a/42332312
		//sc.useLocale(Locale.US);

		// double derajat = sc.nextDouble();
		while (sc.hasNextDouble()) {
			double derajat = sc.nextDouble();
			if (derajat < 0 || derajat >= 360) {
				return;
			}

			// 06:00:00 = 21600 detik
			// 1 hari = 86400 detik
			double waktu = (derajat * 86400.0 / 360.0 + 21600.0) % 86400.0;
			// Pagi = 05:00:00-11:59:59
			if (waktu >= 5*60*60 && waktu < 12*60*60) {
				System.out.println("Selamat pagi");
			}
			// Siang = 12:00:00-15:59:59
			else if (waktu >= 12*60*60 && waktu < 16*60*60) {
				System.out.println("Selamat siang");
			}
			// Sore = 16:00:00-17:59:59
			else if (waktu >= 16*60*60 && waktu < 18*60*60) {
				System.out.println("Selamat sore");
			}
			// Malam = 18:00:00-04:59:59
			else {
				System.out.println("Selamat malam");
			}

			// Format jam
			int jam, menit, detik;
			for (jam = 0; waktu >= 3600; jam++) {
				waktu -= 3600.0;
			}
			for (menit = 0; waktu >= 60; menit++) {
				waktu -= 60.0;
			}
			for (detik = 0; waktu >= 1; detik++) {
				waktu -= 1.0;
			}
			System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
		}
	}
}
