import java.io.*;
import java.util.*;

class RPL8Tugas2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String path1 = sc.nextLine() + ".txt";
		String path2 = sc.nextLine() + ".txt";

		// Windows tanpa dukungan folder case-sensitive:
		// harus menggunakan "equalsIgnoreCase"
		if (path1.equals(path2)) {
			System.out.println("File tidak boleh sama");
			return;
		}

		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader(path1);
			out = new FileWriter(path2);

			ArrayList<String> lines = new ArrayList<>();
			BufferedReader reader = new BufferedReader(in);
			PrintWriter writer = new PrintWriter(out);
			int max = Integer.MIN_VALUE;

			for (String s = reader.readLine(); s != null; s = reader.readLine()) {
				s = s.replaceAll("\t", "    ");
				lines.add(s);
				max = Math.max(max, s.length());
			}

			String format = String.format("%%%ds\n", max);
			for (String s: lines) {
				if (s.length() > 0)
					writer.printf(format, s);
				else
					writer.println();
			}

			writer.flush();
			System.out.println("Berhasil");
		} catch (IOException e) {
			System.out.println("Gagal");
			System.out.println(e);
		} finally {
			try {
				if (in != null) in.close();
				if (out != null) out.close();
			} catch (IOException e) {
				System.out.println(e);
				System.exit(1);
			}
		}
	}
}
