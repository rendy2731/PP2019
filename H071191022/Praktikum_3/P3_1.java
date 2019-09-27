import java.util.Scanner;

public class P3_1 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        System.out.println("masukkan nilai awal");
        int x = lab.nextInt();
        System.out.println("masukkan nilai akhir");
        int y = lab.nextInt();
        if (x>y){
            int t = x;
            x = y;
            y = t;
        }
        for (int i = x; i <= y; i++) {
            if (x==0){
                System.out.println("0 nol");
            }else{
                System.out.print(i);
                System.out.print(i % 2 == 0? " genap " : " ganjil");
                System.out.println(i < 0 ? " negatif " : " positif");
            }
            
        }

    lab.close();
    }
}
