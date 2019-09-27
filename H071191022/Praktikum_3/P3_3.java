import java.util.Scanner;
public class P3_3 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        int a = 0;
        int b = 1;
        int hasil = 0;
        int angka = lab.nextInt();

        for (int i = 0; i < angka; i++) {
            a = b;
            b = hasil;
            System.out.print(hasil + " ");
            hasil = a+b;
            
        }
    }
}