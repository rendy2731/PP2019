import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

class RPL8Tugas4 {
	// Nama Database
	final static String DBNAME = "data_mahasiswa.txt";

	public static void main(String[] args) {
		// Setiap HashMap mengandung key: nama, nim, jurusan, alamat
		ArrayList<HashMap<String, String>> data = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// Load database
		loadData(data);
		// Tampilkan
		showUsers(data);

		int a = 0;
		do {
			// Print instruksi
			System.out.println("1. Tambah Data");
			System.out.println("2. Perbarui Data");
			System.out.println("3. Hapus Data");
			System.out.println("4. Tampilkan Daftar Mahasiswa");
			System.out.println("5. Tampilkan Info Mahasiswa");
			System.out.println("6. Keluar");
			System.out.print("Input: ");

			try {
				a = readInt(sc);
			} catch (InputMismatchException e) {
				System.out.println("Input tidak valid");
				a = 0;
			}

			switch (a) {
				case 1: {
					// Tambah Data
					if (addUser(sc, data))
						// Berhasil tertambah? simpan data.
						saveData(data);
					else
						System.out.println("Penambahan data gagal");
					break;
				}
				case 2: {
					// Perbarui Data
					System.out.print("Index: ");
					int i = 0;
					try {
						i = readInt(sc);
					} catch (InputMismatchException e) {}

					// Index didalam rentang?
					if (i > 0 && i <= data.size()) {
						// Kurang 1 karena index input basis 1
						HashMap<String, String> user = data.get(i - 1);

						if (modifyUser(sc, user))
							saveData(data);
						else
							System.out.println("Perbarui data gagal");
					} else
						System.out.println("Perbarui data gagal");

					break;
				}
				case 3: {
					// Hapus data
					System.out.print("Index: ");
					int i = 0;
					try {
						i = readInt(sc);
					} catch (InputMismatchException e) {}

					// Index didalam rentang?
					if (i > 0 && i <= data.size()) {
						data.remove(i - 1);
						saveData(data);
						showUsers(data);
					} else
						System.out.println("Penghapusan data gagal");
					
					break;
				}
				case 4: {
					showUsers(data);
					break;
				}
				case 5: {
					System.out.print("Index: ");
					int i = 0;
					try {
						i = readInt(sc);
					} catch (InputMismatchException e) {}

					// Index didalam rentang?
					if (i > 0 && i <= data.size()) {
						showDetails(data.get(i - 1));
					} else
						System.out.println("Index diluar rentang");
					
					break;
				}
				default:
					System.out.println("Input tidak valid: " + a);
				case 0:
				case 6:
					break;
			}
		} while (a != 6);
	}

	// Menggunakan Scanner.nextLine()
	static int readInt(Scanner sc) {
		try {
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			throw new InputMismatchException(e.getMessage());
		}
	}

	// Scanner bisa saja menghasilkan nilai kosong
	static String readLine(Scanner sc) {
		String s;
		do {
			s = sc.nextLine().trim();
		} while (s.equals(""));
		return s;
	}

	// Method untuk memunculkan daftar data mahasiswa
	static void showUsers(ArrayList<HashMap<String, String>> data) {
		System.out.println("Data Mahasiswa");
		for (int i = 0; i < data.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, data.get(i).get("nama"));
		}
	}

	// Method untuk menambah data mahasiswa
	static boolean addUser(Scanner sc, ArrayList<HashMap<String, String>> data) {
		// Nama
		System.out.print("Nama: ");
		String name = readLine(sc);
		// Cek nama
		if (name.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		}

		// NIM
		System.out.print("NIM: ");
		String nim = readLine(sc);
		// Cek NIM
		if (nim.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		}

		// Jurusan/Prodi
		System.out.print("Jurusan: ");
		String subject = readLine(sc);
		// Cek jurusan
		if (subject.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		}

		// Alamat
		System.out.print("Alamat: ");
		String address = readLine(sc);
		// Cek alamat
		if (address.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		}

		// Set data
		HashMap<String, String> user = new HashMap<String, String>();
		user.put("nim", nim);
		user.put("nama", name);
		user.put("jurusan", subject);
		user.put("alamat", address);

		// Tambahkan
		data.add(user);
		return true;
	}

	// Method untuk mengubah data mahasiswa
	static boolean modifyUser(Scanner sc, HashMap<String, String> user) {
		// Nama
		System.out.print("Nama: ");
		String name = sc.nextLine();
		// Cek nama
		if (name.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		} else if (name.length() > 0)
			// Set nama
			user.put("nama", name);

		// NIM
		System.out.print("NIM: ");
		String nim = sc.nextLine();
		// Cek NIM
		if (nim.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		} else if (nim.length() > 0)
			// Set NIM
			user.put("nim", nim);

		// Jurusan/Prodi
		System.out.print("Jurusan: ");
		String subject = sc.nextLine();
		// Cek jurusan
		if (subject.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		} else if (subject.length() > 0)
			// Set jurusan
			user.put("jurusan", subject);

		// Alamat
		System.out.print("Alamat: ");
		String address = sc.nextLine();
		// Cek alamat
		if (address.contains(";")) {
			System.out.println("Input tidak boleh memiliki semicolon");
			return false;
		} else if (address.length() > 0)
			// Set alamat
			user.put("alamat", address);

		return true;
	}

	// Method untuk menunjukkan info detail mahasiswa
	static void showDetails(HashMap<String, String> user) {
		System.out.println("Nama   : " + user.get("nama"));
		System.out.println("NIM    : " + user.get("nim"));
		System.out.println("Jurusan: " + user.get("jurusan"));
		System.out.println("Alamat : " + user.get("alamat"));
	}

	// Muat database
	static void loadData(ArrayList<HashMap<String, String>> data) {
		File db = new File(DBNAME);

		// Cek jika file ada
		if (db.exists()) {
			FileInputStream fileStream = null;

			try {
				fileStream = new FileInputStream(db);
				// Biar input konsisten
				InputStreamReader readerUTF8 = new InputStreamReader(fileStream, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(readerUTF8);

				// Baca per baris
				for (String str = reader.readLine(); str != null; str = reader.readLine()) {
					str = str.trim();

					// String kosong?
					if (str.length() == 0)
						continue;

					// Penampung data
					HashMap<String, String> userData = new HashMap<>();
					// Potong string pada semicolon
					String list[] = str.split(";");

					if (list.length < 4) {
						System.out.println("Baris tidak benar diabaikan: " + str);
						continue;
					}

					// Set data
					userData.put("nim", list[0]);
					userData.put("nama", list[1]);
					userData.put("jurusan", list[2]);
					userData.put("alamat", list[3]);
					// Tambahkan
					data.add(userData);
				}
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}

			// Tutup file
			if (fileStream != null) {
				try {
					fileStream.close();
				} catch (IOException e) {
					e.printStackTrace(System.out);
				}
			}
		}
	}

	// Simpan database
	static void saveData(ArrayList<HashMap<String, String>> data) {
		FileOutputStream fileStream = null;

		try {
			// Buka file
			fileStream = new FileOutputStream(DBNAME);
			OutputStreamWriter writer = new OutputStreamWriter(fileStream, StandardCharsets.UTF_8);
			
			for (HashMap<String, String> user: data) {
				// Tulis
				writer.write(String.format(
					"%s;%s;%s;%s;#\n",
					user.get("nim"),
					user.get("nama"),
					user.get("jurusan"),
					user.get("alamat")
				));
			}

			writer.flush();
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}

		// Tutup file
		if (fileStream != null) {
			try {
				fileStream.close();
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}
		}
	}
}
