class RPL5Latihan1 {
	// Tugas: RPL2Tugas2 dalam method.
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;

		print(luasPersegi(a, b));
		print(luasSegitiga(a, b));
		print(luasTrapesium(a, b, c));
	}

	static double luasPersegi(double p, double l) {
		return p * l;
	}

	static double luasSegitiga(double a, double t) {
		return a * t * 0.5;
	}

	static double luasTrapesium(double a, double b, double t) {
		return (a + b) * t * 0.5;
	}

	static void print(double a) {
		System.out.printf("%.2f\n", a);
	}
}
