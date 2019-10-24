import java.util.Scanner;

public class ShiftName {

    public static void main(String[] args) {
        Scanner sep = new Scanner(System.in);
        String name = scanner.nextLine();
        int shift = scanner.nextInt();
        sep.close();
        System.out.println(shiftChar(name, shift));
    }

    public static String shiftChar(String str, int n) {
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + n <= 'Z' || str.charAt(i) + n <= 'z') {
                //(char) untuk diubah menjadi karakter
                result += (char)(str.charAt(i) + n);
            }
        }
        return result;
    }
}