import java.util.*;

class RPL7Latihan1 {
	public static void main(String[] args) {
		ArrayList<String> anggotaPKI = new ArrayList<>(Arrays.asList("Takdim", "Iksan", "Devon"));
		StringBuilder sb = new StringBuilder();
		for (int i = anggotaPKI.size() - 1; i >= 0; i--) {
			sb.setLength(0);
			System.out.println(sb.append(anggotaPKI.get(i).toUpperCase()).reverse().toString());
		}
	}
}
