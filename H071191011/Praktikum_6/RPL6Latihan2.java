import java.util.Scanner;

class RPL6Latihan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String p = sc.nextLine().replaceAll("\\s+", "");
		char pc[] = p.toCharArray();

		for (int i = 0; i < pc.length / 2; i++) {
			char t = pc[pc.length - i - 1];
			pc[pc.length - i - 1] = pc[i];
			pc[i] = t;
		}

		System.out.println(p.equalsIgnoreCase(new String(pc)));
	}
}
