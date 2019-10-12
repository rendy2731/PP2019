import java.util.Scanner;

class RPL4Tugas2 {
	// Menerima sebuah input integer i, j, k yang merupakan ukuran dari dua
	// buah array 2D (matriks) A_ij dan B_jk diikuti input integer
	// elemen-elemennya. Buatlah program perkalian matriks A_ij x B_jk
	// sehingga menghasilkan sebuah matriks yang berordo C_ik
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		if (i < 1 || j < 1 || k < 1) {
			System.out.println("Tidak ada input yang aman (< 1)");
			return;
		}

		int a[][] = new int[i][j];
		int b[][] = new int[j][k];

		// Input matriks A
		for (int l = 0; l < i; l++) {
			for (int m = 0; m < j; m++) {
				a[l][m] = sc.nextInt();
			}
		}

		// Input matriks B
		for (int l = 0; l < j; l++) {
			for (int m = 0; m < k; m++) {
				b[l][m] = sc.nextInt();
			}
		}

		// Hitung matriks C
		// Visualisasi 4x2 dan 2x3
		//         b11 b12 b13 b14
		//         b21 b22 b23 b24
		// a11 a12 c11 c12 c13 c14
		// a21 a22 c21 c22 c23 c24
		// a31 a32 c31 c32 c33 c34
		// c11 = a11 * b11 + a12 * b21
		// c12 = a11 * b12 + a12 * b22
		// c21 = a21 * b11 + a22 * b21
		// ...
		for (int l = 0; l < i; l++) {
			for (int m = 0; m < k; m++) {
				int sum = 0;
				for (int o = 0; o < j; o++) {
					sum += a[l][o] * b[o][m];
				}

				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
