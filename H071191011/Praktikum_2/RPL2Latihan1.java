import java.util.Scanner;

class RPL2Latihan1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x == 0 && y == 0)
			System.out.println("Koordinat (0,0) berada di pusat");
		else if (x == y) {
			System.out.printf("Koordinat (%d,%d) berada di garis y = x", x, y);
			if (x > 0)
				System.out.println(" antara kuadran 3 dan 4");
			else
				System.out.println(" antara kuadran 7 dan 8");
		} else if (x == -y) {
			System.out.printf("Koordinat (%d,%d) berada di garis y = -x", x, y);
			if (x > 0)
				System.out.println(" antara kuadran 5 dan 6");
			else
				System.out.println(" antara kuadran 1 dan 2");
		} else if (x == 0)
			System.out.printf("Koordinat (0,%d) berada di sumbu-y\n", y);
		else if (y == 0)
			System.out.printf("Koordinat (%d,0) berada di sumbu-x\n", x);
		else {
			double angle = Math.toDegrees(Math.atan2(y, x));

			if (angle >= 0 && angle <= 45)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 4\n", x, y);
			else if (angle >= 45 && angle <= 90)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 3\n", x, y);
			else if (angle >= 90 && angle <= 135)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 2\n", x, y);
			else if (angle >= 135 && angle <= 180)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 1\n", x, y);
			else if (angle >= 180 && angle <= 225)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 8\n", x, y);
			else if (angle >= 225 && angle <= 270)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 7\n", x, y);
			else if (angle >= 270 && angle <= 315)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 6\n", x, y);
			else if (angle >= 315 && angle <= 360)
				System.out.printf("Koordinat (%d,%d) berada di kuadran 5\n", x, y);
		}
	}
}
