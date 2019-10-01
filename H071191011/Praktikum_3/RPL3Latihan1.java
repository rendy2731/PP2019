import java.util.Scanner;

class RPL3Latihan1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Math.abs(sc.nextLong());
		long r = Math.abs(sc.nextLong());
		long nr = n - r;

		if (r > n || r == 0) {
			System.out.println("Tidak ada R yang aman");
			return;
		}

		long factN = n;
		for (long i = n - 1; i > 1; i--)
			factN *= i;
		
		long factR = r;
		for (long i = r - 1; i > 1; i--)
			factR *= i;
		
		long factNR = nr == 0 ? 1 : nr;
		for (long i = nr - 1; i > 1; i--)
			factNR *= i;
		
		long result = factN / (factR * factNR);
		System.out.println(result + " kombinasi");
	}
}