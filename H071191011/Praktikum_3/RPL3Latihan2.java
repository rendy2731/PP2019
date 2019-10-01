class RPL3Latihan2 {
	public static void main(String[] args) {
		int N = 9;
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			for (int j = 0; j < sum; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
