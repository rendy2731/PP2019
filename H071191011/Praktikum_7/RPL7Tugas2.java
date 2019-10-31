import java.util.*;

class RPL7Tugas2 {
	// Buatlah program untuk mendekripsi kode morse
	public static void main(String[] args) {
		// Setup kode morse
		HashMap<Byte, Character> morse = new HashMap<>();
		// Bit Encoding: lllmmmmm
		// Dit = 0
		// Dah = 1
		//                      panjang    | dit/dah (dari kiri ke kanan)
		morse.put((byte) ((2 << 5) | 0b00010), 'A');
		morse.put((byte) ((4 << 5) | 0b00001), 'B');
		morse.put((byte) ((4 << 5) | 0b00101), 'C');
		morse.put((byte) ((3 << 5) | 0b00001), 'D');
		morse.put((byte) ((1 << 5) | 0b00000), 'E');
		morse.put((byte) ((4 << 5) | 0b00100), 'F');
		morse.put((byte) ((3 << 5) | 0b00011), 'G');
		morse.put((byte) ((4 << 5) | 0b00000), 'H');
		morse.put((byte) ((2 << 5) | 0b00000), 'I');
		morse.put((byte) ((4 << 5) | 0b01110), 'J');
		morse.put((byte) ((3 << 5) | 0b00101), 'K');
		morse.put((byte) ((4 << 5) | 0b00010), 'L');
		morse.put((byte) ((2 << 5) | 0b00011), 'M');
		morse.put((byte) ((2 << 5) | 0b00001), 'N');
		morse.put((byte) ((3 << 5) | 0b00111), 'O');
		morse.put((byte) ((4 << 5) | 0b00110), 'P');
		morse.put((byte) ((4 << 5) | 0b01011), 'Q');
		morse.put((byte) ((3 << 5) | 0b00010), 'R');
		morse.put((byte) ((3 << 5) | 0b00000), 'S');
		morse.put((byte) ((1 << 5) | 0b00001), 'T');
		morse.put((byte) ((3 << 5) | 0b00100), 'U');
		morse.put((byte) ((4 << 5) | 0b01000), 'V');
		morse.put((byte) ((3 << 5) | 0b00110), 'W');
		morse.put((byte) ((4 << 5) | 0b01001), 'X');
		morse.put((byte) ((4 << 5) | 0b01101), 'Y');
		morse.put((byte) ((4 << 5) | 0b00011), 'Z');
		morse.put((byte) ((5 << 5) | 0b11111), '0');
		morse.put((byte) ((5 << 5) | 0b11110), '1');
		morse.put((byte) ((5 << 5) | 0b11100), '2');
		morse.put((byte) ((5 << 5) | 0b11000), '3');
		morse.put((byte) ((5 << 5) | 0b10000), '4');
		morse.put((byte) ((5 << 5) | 0b00000), '5');
		morse.put((byte) ((5 << 5) | 0b00001), '6');
		morse.put((byte) ((5 << 5) | 0b00011), '7');
		morse.put((byte) ((5 << 5) | 0b00111), '8');
		morse.put((byte) ((5 << 5) | 0b01111), '9');

		// Setup scanner
		Scanner sc = new Scanner(System.in);
		// Baca baris baru dan pisah
		String line = sc.nextLine();
		// Cek apakah input tidak hanya terdiri dari titik, minus, dan spasi
		if (line.matches("[\\.|\\-|\\s|\\/]+") == false) {
			System.out.println("Kode morse tidak valid");
			return;
		}

		// Pisah spasi
		String words[] = line.split("\\/");
		// Buat StringBuilder
		StringBuilder result = new StringBuilder();

		// Loop
		for (String word: words) {
			// Trim & pusah
			String letters[] = word.trim().split("\\s+");
			// Loop
			for (String morseChar: letters) {
				byte morseCode = 0;
				int morseLen = Math.min(morseChar.length(), 5);
				// Ubah dit/dah jadi 0/1
				for (int i = morseLen - 1; i >= 0; i--)
					morseCode = (byte) ((morseCode << 1) | (morseChar.charAt(i) == '-' ? 1 : 0));

				result.append(morse.getOrDefault((byte) (morseLen << 5 | morseCode), '?'));
			}

			result.append(' ');
		}

		result.setLength(result.length() - 1);
		System.out.println(result.toString());
	}
}
