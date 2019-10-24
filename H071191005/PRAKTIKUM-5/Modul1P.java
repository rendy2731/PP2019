import java.util.Scanner;

class Modul1P {
	// Hitung FPB
	static int HitungFPB(int a, int b) {
		int ayo;

		while (b != 0) {
			ayo = a % b;
			a = b;
			b = ayo;
		}

		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		if (a <= 0) {
			System.out.println("input data  (1)");
			return;
		}
		
        int b = sc.nextInt();
		if (b <= 0) {
			System.out.println("Input (2)");
			return;
		}

		System.out.println("FPB dari " + a + " dan " + b + " = " + HitungFPB(a, b));
		}
	}
	