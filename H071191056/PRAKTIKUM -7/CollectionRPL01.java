import java.util.*;
/**
 * CollectionRPL01
 */
public class CollectionRPL01 {
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<>();
        int awal = raf.nextInt();
        int akhir = raf.nextInt();
        raf.close();

        for (int i = awal; (awal > akhir) ? i >= akhir : i <= akhir; i += (awal > akhir) ? -1 : 1) {
            int mutlak = Math.abs(i);
            boolean cek = true;

            while (mutlak > 0) {
                int nilai = mutlak % 10;
                mutlak /= 10;
                if (nilai == 0 || i % nilai != 0) {
                    cek = !cek;
                    break;
                }
            }
            if (cek && i != 0) {
                angka.add(i);
            }
        }
        for (int j = 0; j < angka.size(); j++) {
            System.out.print(angka.get(j) + " ");
        }
    }
    
}