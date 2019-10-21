// Input sebuah string & integer lalu tambahkan per karakter (A-Z, a-z)

import java.util.Scanner;

class RPL6Tugas3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int n = sc.nextInt();

		for (int i = 0; i < c.length; i++) {
			char ch = c[i];

			if (ch >= 65 && ch <= 90) {
				c[i] = (char) (Math.floorMod(ch - 65 + n, 26) + 65);
			} else if (ch >= 97 && ch <= 122) {
				c[i] = (char) (Math.floorMod(ch - 97 + n, 26) + 97);
			}
		}

		System.out.println(new String(c));
	}
}
