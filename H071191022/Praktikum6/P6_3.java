import java.util.Scanner;

public class P6_3 {

    // soal tambahan kelas C

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        String name = sep.nextLine();
		char keep[] = name.toCharArray();
		int  shiftNumber = sep.nextInt();

		for (int i = 0; i < keep.length; i++) {

			char save = keep[i];

			if (save >= 'A' && save <= 'Z') {
				keep[i] = (char) (Math.floorMod(save - 'A' + shiftNumber, 26) + 'A');
			} else if (save >= 97 &&  save <= 122) {
				keep[i] = (char) (Math.floorMod(save - 'a' + shiftNumber, 26) + 'a');
			}
		}
		System.out.println(new String(keep));
    }
}


