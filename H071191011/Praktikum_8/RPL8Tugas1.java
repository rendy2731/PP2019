import java.io.*;
import java.util.Scanner;

class RPL8Tugas1 {
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

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(path1);
			out = new FileOutputStream(path2);

			for (int i = in.read(); i != -1; i = in.read())
				out.write(i);
			
			out.flush();
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
