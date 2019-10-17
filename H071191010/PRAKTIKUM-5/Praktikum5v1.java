import java.util.Scanner;

class Praktikum5v1 {
	
	static int FPB(int a, int b) {
		int temp;

		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}

		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		if (a <= 0) {
			System.out.println("input");
			return;
		}

		int b = sc.nextInt();
		if (b <= 0) {
			System.out.println("inputan");
			return;
		}

		System.out.println("FPB dari " + a + " dan " + b + " = " + FPB(a, b));
	}
}