import java.util.*;

class RPL7Tugas3 {
	// Buatlah program yang mencari bilangan yang bisa dibagi dengan digit2nya
	// sendiri.
	public static void main(String[] args) {
		// Hasil
		ArrayList<Integer> result = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		// Loop dari a -> b = 1; Loop dari b -> a = -1
		int inc = b > a ? 1 : -1;

		// Loop
		for (int i = a; i != b; i += inc)
			checkAndAddSelfDiv(result, i);
		// Cek juga untuk "b" karena i != b artinya "b" tidak masuk.
		checkAndAddSelfDiv(result, b);
		// Print array
		System.out.println(arrayToString(result));
	}

	static void checkAndAddSelfDiv(ArrayList<Integer> result, int i) {
		// Jangan tambahkan 0
		if (i == 0)
			return;

		// Variabel sementara
		int x = i;
		// Jika ini true, maka bilangan i bisa dibagi dengan digit2nya.
		boolean canDivide = true;
		// Loop
		while (x != 0) {
			int c = x % 10;
			x /= 10;

			// Cek jika digit nol
			if (c == 0) {
				if (x == 0)
					continue;
				else {
					canDivide = false;
					break;
				}
			}
			if (i % c != 0) {
				// Jika tidak bisa dibagi habis, set ke false
				canDivide = false;
				break;
			}
		}

		// Jika bisa dibagi habis, tambahkan
		if (canDivide)
			result.add(i);
	}

	static String arrayToString(ArrayList al) {
		if (al.size() == 0)
			return "[];";

		StringBuilder sb = new StringBuilder("[");
		for (Object obj: al) {
			sb.append(obj.toString());
			sb.append(", ");
		}

		sb.setLength(sb.length() - 2);
		sb.append("];");
		return sb.toString();
	}
}