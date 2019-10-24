import java.util.Scanner;

public class Fpb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();
        Fpb namaObjek = new Fpb();
        System.out.println(namaObjek.getFpb(x, y, z));
    }

    public int getFpb(int a, int b, int c) {
        int min = a < b && a < c ? a : b < a && b < c ? b : c;
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return i;
            }
        }
        return 1;
    }
}