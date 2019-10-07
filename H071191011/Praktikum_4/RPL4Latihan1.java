import java.util.Scanner;

class RPL4Latihan1 {
	// Input integer n. Buatlah array (integer) dengan size n kemudian input
	// masing-masing nilai elemen array. Print semua elemen array yang
	// merupakan bilangan genap!
	// Catatan: print output setelah semua angka diinput.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Entah apa yang merasuki arraymu");
			return;
		}

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int x: a) {
			if (x % 2 == 0)
				System.out.print(x + " ");
		}
		System.out.println();
	}
}
