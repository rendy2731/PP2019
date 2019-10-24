// Soal sendiri
import java.util.Scanner;

// Buatlah program yang meng"enkripsi" karakter berdasarkan "kunci" yang berupa
// bilangan dengan jenis tipe data long.
// Batas rentang "lompat" karakter ASCII yaitu 32...126 (modulo)
// Jika karakter diluar rentang itu, maka karakter itu diabaikan
// (tidak dibuang, tapi diabaikan).
// Program meminta 2 input, yaitu:
// * 1 string yang dipisah dengan baris baru
// * 1 bilangan long, tidak boleh 0
// Jika input bilangan long negatif, maka program akan men"dekripsi"
// karakter input.
// -- Contoh input 1 --
// Hello World
// 12345
// -- Contoh output 1 --
// `"_{lpOR50_
//
// -- Contoh input 2 --
// `"_{lpOR50_
// -12345
// -- Contoh output 2 --
// Hello World
//
// -- Contoh input 3 --
// Tae Hanazono
// 6624
// -- Contoh output 3 --
// w\\ea@wK(rM>
// 
// -- Contoh input 4 --
// w\\ea@wK(rM>
// -6624
// -- Contoh output 4 --
// Tae Hanazono
class RPL6Tugas4 {
	// Menambah karakter dan menjaganya di rentang 32...126
	static char transform(char c, int n) {
		if (c >= 32 && c <= 126)
			c = (char) (Math.floorMod(c - 32 + n, 95) + 32);
		return c;
	}

	// Fungsi untuk membuat bilangan "acak"
	static long pseudoRandom(long state, long mul, long add) {
		return state * mul + add;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input karakter
		String input = sc.nextLine();
		char inputChar[] = input.toCharArray();

		// "kunci" enkripsi
		long seed = sc.nextLong();
		if (seed == 0) {
			System.out.println("Input pertama tidak boleh nol");
			return;
		}

		// Nilai variabel ini akan "1" jika input seed positif.
		// Sebaliknya, nilai variabel ini akan "-1" jika input seed negatif.
		short encrypt = (short) (Math.abs(seed) / seed);
		seed = Math.abs(seed);

		for (int i = 0; i < inputChar.length; i++) {
			// Update kunci
			// https://en.wikipedia.org/wiki/Linear_congruential_generator#Parameters_in_common_use
			seed = pseudoRandom(seed, 214013, 2531011);
			// Ambil 8-bit pertama dari "seed"
			short key = (short) (seed & 255);
			// Kalikan dengan bilangan "encrypt" untuk "menambah" atau "mengurang" karakter.
			inputChar[i] = transform(inputChar[i], key * encrypt);
		}

		// Print hasil
		System.out.println(new String(inputChar));
	}
}
