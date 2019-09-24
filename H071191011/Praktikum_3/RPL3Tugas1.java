import java.util.Scanner;

class RPL3Tugas1 {
	// Buatlah program untuk menentukan ganjil atau genap dan positif atau
	// negatif suatu inputan
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		// Urutkan
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}

		for (int i = x; i <= y; i++) {
			if (i == 0)
				System.out.println("0 nol");
			else {
				System.out.print(i);
				System.out.print(i % 2 == 0 ? " genap" : " ganjil");
				System.out.println(i < 0 ? " negatif" : " positif");
			}
		}
	}
}
