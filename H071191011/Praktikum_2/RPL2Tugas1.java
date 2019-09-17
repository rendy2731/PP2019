import java.util.Scanner;

class RPL2Tugas1 {
	// Buatlah program yang menerima 5 inputan bilangan bulat a,b,c,d,e.
	// Print jumlah angka-angka yang merupakan bilangan genap, ganjil,
	// positif, dan negatif. Pada kasus ini, 0 mrupakan bilangan genap,
	// bukan positif dan negatif. Lalu jika program menerima inputan bukan
	// bilangan bulat, maka program akan menampilkan "Inputan tidak valid".
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Read input
			int
			a = sc.nextInt(),
			b = sc.nextInt(),
			c = sc.nextInt(),
			d = sc.nextInt(),
			e = sc.nextInt();

			// Variabel dibawah masing-masing bernilai 1 jika a, b, c, d, e
			// masing-masing genap dan bernilai 0 sebaliknya.
			int
			aEven = a % 2 == 0 ? 1 : 0,
			bEven = b % 2 == 0 ? 1 : 0,
			cEven = c % 2 == 0 ? 1 : 0,
			dEven = d % 2 == 0 ? 1 : 0,
			eEven = e % 2 == 0 ? 1 : 0;
	
			// Bilangan genap
			int evenNumbers = aEven + bEven + cEven + dEven + eEven;
	
			// Bilangan ganjil
			// Jika ada N bilangan genap dari M bilangan, maka pasti ada
			// M-N bilangan yang ganjil.
			int oddNumbers = 5 - evenNumbers;
	
			// Bilangan positif
			int positiveNumbers = 0;
			positiveNumbers += a > 0 ? 1 : 0;
			positiveNumbers += b > 0 ? 1 : 0;
			positiveNumbers += c > 0 ? 1 : 0;
			positiveNumbers += d > 0 ? 1 : 0;
			positiveNumbers += e > 0 ? 1 : 0;
	
			// Bilangan negatif
			// Hal seperti penghitungan bil. ganjil tidak bisa dilakukan
			// karena bisa saja ada bilangan (a,b,c,d,e) yang 0, dan 0 bukan
			// positif maupun negatif.
			int negativeNumbers = 0;
			negativeNumbers += a < 0 ? 1 : 0;
			negativeNumbers += b < 0 ? 1 : 0;
			negativeNumbers += c < 0 ? 1 : 0;
			negativeNumbers += d < 0 ? 1 : 0;
			negativeNumbers += e < 0 ? 1 : 0;
	
			// Output
			System.out.println(evenNumbers + " bilangan genap");
			System.out.println(oddNumbers + " bilangan ganjil");
			System.out.println(positiveNumbers + " bilangan positif");
			System.out.println(negativeNumbers + " bilangan negatif");
		} catch (Exception ex) {
			System.out.println("Inputan tidak valid");
		}
	}
}
