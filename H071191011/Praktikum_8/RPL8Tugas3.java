import java.io.*;
import java.util.*;

class RL8Tugas3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nama file
		String filename = sc.next() + ".txt";

		// Banyak inputan
		int n = sc.nextInt();

		// Init
		String name[] = new String[n];
		String id[] = new String[n];
		String year[] = new String[n];

		// Panjang tabel
		int maxName = 4;
		int maxID = 3;
		int maxYear = 8;

		for (int i = 0; i < n; i++) {
			// Nama: kalo ada spasi pake underscore (replace underscore jadi spasi)
			name[i] = sc.next().replaceAll("_", " ");
			maxName = Math.max(maxName, name[i].length());
			// NIM: Max 10
			String idTemp = sc.next();
			id[i] = idTemp.substring(0, Math.min(idTemp.length(), 10));
			maxID = Math.max(maxID, id[i].length());
			// Angkatan
			year[i] = String.valueOf(sc.nextInt());
			maxYear = Math.max(maxYear, year[i].length());
		}

		// Buka file
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filename);
			PrintWriter writer = new PrintWriter(out);

			// Buat formatter
			String formatter = String.format("| %%-%ds | %%-%ds | %%-%ds |\n", maxName, maxID, maxYear);

			// Pembatas
			String border = String.format("+-%s-+-%s-+-%s-+", rep('-', maxName), rep('-', maxID), rep('-', maxYear));

			// Tulis file
			writer.println(border);
			writer.printf(formatter, "Nama", "NIM", "Angkatan");
			writer.println(border);
			for (int i = 0; i < n; i++)
				writer.printf(formatter, name[i], id[i], year[i]);
			writer.println(border);

			// Selesai
			writer.flush();
			System.out.println("Berhasil");
		} catch (IOException e) {
			System.out.println("Gagal");
		} finally {
			try {
				if (out != null) out.close();
			} catch (IOException e) {
				System.out.println(e);
				System.exit(1);
			}
		}
	}

	// Method untuk menduplikasi char menjadi string
	static String rep(char c, int n) {
		char ch[] = new char[n];
		Arrays.fill(ch, c);
		return new String(ch);
	}
}
