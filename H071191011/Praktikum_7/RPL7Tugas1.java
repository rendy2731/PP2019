import java.util.*;

class RPL7Tugas1 {
	// Buatlah sebuah origram dengan tema "Favourite Movie" yang dapat
	// menyimpan, menampilkan, mencari, dan menghapus daftar film-film
	// kesukaan Anda beserta detail dari film tersebut, seperti judul,
	// tanggal rilis, durasi, genre, sinopsis, serta daftar aktor dan
	// aktris yang berperan di dalamnya.
	public static void main(String[] args) {
		// Pelm: Endgame, Far From Home, Venom, Thor Ragnarok
		// Detail, Search, Add, Remove
		HashMap<String, ArrayList<String>> movieData = new HashMap<>();
		movieData.put("title", new ArrayList<>());
		movieData.put("release", new ArrayList<>());
		movieData.put("duration", new ArrayList<>());
		movieData.put("synopsis", new ArrayList<>());
		movieData.put("genre", new ArrayList<>());
		movieData.put("cast", new ArrayList<>());

		// Avengers: Endgame
		addMovieData(
			movieData,
			"Avengers: Endgame",                          /* Judul */
			"24 April 2019",                              /* Tanggal Rilis */
			"3 jam 1 menit",                              /* Durasi */
			"Adventure, Sci-Fi, Action",                  /* Genre */
			"\"Ini adalah sinopsis\"",                    /* Sinopsis */
			"Robert Downey Jr., Chris Evan, Mark Ruffalo" /* Aktor & Aktris */
		);
		// Spiderman: Far From Home
		addMovieData(
			movieData,
			"Spiderman: Far From Home",
			"3 Juli 2019",
			"2 jam 9 menit",
			"Action, Adventure, Sci-Fi",
			"\"TODO\"",
			"Tom Holland, Zendaya, Jake Gyllenhaal"
		);
		// Venom
		addMovieData(
			movieData,
			"Venom",
			"3 Oktober 2018",
			"2 jam 20 menit",
			"Action, Sci-Fi, Thriller",
			"\"???\"",
			"Tom Hardy, Michelle Williams, Woody Harrelson"
		);
		// Thor: Ragnarok
		addMovieData(
			movieData,
			"Thor: Ragnarok",
			"25 Oktober 2017",
			"2 jam 10 menit",
			"Action, Adventure, Comedy",
			"\"Banned, Thanks!\"",
			"Chris Hemsworth, Taika Waititi, Tessa Thompson"
		);
		// Tampilkan
		showMovies(movieData);

		// Main loop
		Scanner sc = new Scanner(System.in);
		char c = '_';
		do {
			System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
			try {
				String s;
				do {
					s = sc.next();
				} while (s.length() == 0);
				c = s.charAt(0);

				switch (c) {
					case 'd':
					{
						int index = sc.nextInt() - 1;
						showDetail(movieData, index);
						break;
					}
					case 's':
					{
						String find = readLine(sc);
						findMovie(movieData, find);
						break;
					}
					case 'a': {
						addMovie(movieData, sc);
						showMovies(movieData);
						break;
					}
					case 'r': {
						int index = sc.nextInt() - 1;
						if (removeMovie(movieData, index))
							showMovies(movieData);
						break;
					}
					default:
						System.out.println("Invalid input");
					case 'q':
						break;
				}
			} catch (InputMismatchException _) {
				System.out.println("Invalid input");
			}
		} while (c != 'q');
	}

	// Masalah: Scanner bisa saja menghasilkan nilai kosong
	static String readLine(Scanner sc) {
		String s;
		do {
			s = sc.nextLine();
		} while (s.equals(""));
		return s.trim();
	}

	// Assumed 0-based index
	static void showDetail(HashMap<String, ArrayList<String>> movieData, int index) {
		ArrayList<String> title = movieData.get("title");
		if (index < 0 || index >= title.size()) {
			System.out.println("Index out of range");
			return;
		}

		// Print detail
		System.out.println("Judul    : " + title.get(index));
		System.out.println("Rilis    : " + movieData.get("release").get(index));
		System.out.println("Durasi   : " + movieData.get("duration").get(index));
		System.out.println("Genre    : " + movieData.get("genre").get(index));
		System.out.println("Sinopsis : " + movieData.get("synopsis").get(index));
		System.out.println("Cast     : " + movieData.get("cast").get(index));
	}

	// Method untuk memasukkan data film
	static void addMovieData(
		HashMap<String, ArrayList<String>> movieData,
		String title,
		String releaseDate,
		String duration,
		String genre,
		String synopsis,
		String cast
	) {
		movieData.get("title").add(title);
		movieData.get("release").add(releaseDate);
		movieData.get("duration").add(duration);
		movieData.get("synopsis").add(synopsis);
		movieData.get("genre").add(genre);
		movieData.get("cast").add(cast);
	}

	static void showMovies(HashMap<String, ArrayList<String>> movieData) {
		ArrayList<String> title = movieData.get("title");
		System.out.println("Favorite Movie");

		for (int i = 0; i < title.size(); i++)
			System.out.printf("%d. %s\n", i + 1, title.get(i));
	}

	static void findMovie(HashMap<String, ArrayList<String>> movieData, String keyword) {
		ArrayList<String> title = movieData.get("title");
		ArrayList<String> result = new ArrayList<>();
		String k = keyword.toLowerCase();

		for (int i = 0; i < title.size(); i++) {
			String t = title.get(i);
			if (t.toLowerCase().indexOf(k) != -1)
				result.add(String.format("%d. %s", i + 1, t));
		}

		System.out.println("Found " + result.size() + " match(es) for \"" + keyword + "\"");
		for (String m: result)
			System.out.println(m);
	}

	static void addMovie(HashMap<String, ArrayList<String>> movieData, Scanner sc) {
		System.out.print("Judul: ");
		String mTitle = readLine(sc);
		System.out.print("Rilis: ");
		String mRelDate = readLine(sc);
		System.out.print("Durasi: ");
		String mDur = readLine(sc);
		System.out.print("Genre: ");
		String mGenre = readLine(sc);
		System.out.print("Sinopsis: ");
		String mSynopsis = readLine(sc);
		System.out.print("Cast: ");
		String mCast = readLine(sc);
		addMovieData(movieData, mTitle, mRelDate, mDur, mGenre, mSynopsis, mCast);
	}

	// 0-based index
	static boolean removeMovie(HashMap<String, ArrayList<String>> movieData, int index) {
		ArrayList<String> title = movieData.get("title");

		if (index < 0 || index >= title.size()) {
			System.out.println("Invalid index");
			return false;
		}

		title.remove(index);
		movieData.get("release").remove(index);
		movieData.get("duration").remove(index);
		movieData.get("synopsis").remove(index);
		movieData.get("genre").remove(index);
		movieData.get("cast").remove(index);
		return true;
	}
}
