import java.util.Scanner;

class RPL6Tugas1 {
	// Transformasi 1: Buat kata baru dari kata tanpa spasi yang memuat
	// (karakter / 2) huruf pertama.
	static String ubah1(String s) {
		char c[] = s.toUpperCase().toCharArray();
		int length = c.length;

		for (int i = 0, j = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				length--;
				continue;
			}
			c[j++] = c[i];
		}

		// new String(char[], int offset, int length)
		return new String(c, 0, length / 2);
	}
	
	// Transformasi 2: Manipulasi kata baru menjadi palindrom
	static String ubah2(String s) {
		char c[] = s.toCharArray();
		char t[] = new char[c.length - 1];
		for (int i = 0; i < t.length; i++) {
			t[i] = c[c.length - i - 2];
		}

		return s + (new String(t));
	}

	// Transformasi 3: Output string sesuai output
	static String ubah3(int initialTextLength, String palindrome) {
		String hex = String.format("%X", initialTextLength * initialTextLength);

		int hexAngkaDepan = hex.charAt(0) - '0';
		char sym = (hexAngkaDepan >= 0 && hexAngkaDepan <= 9) ? '!' : '?';

		return String.format("#%s%s%o%c", hex, palindrome, initialTextLength, sym);
	}

	// Buatlah program untuk membuat kode unik dari sebuah kalimat.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String transformed1 = ubah2(ubah1(text));
		String transformed2 = ubah3(text.length(), transformed1);
		System.out.println(transformed2);
	}
}
