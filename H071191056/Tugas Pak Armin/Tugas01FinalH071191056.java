import java.util.Scanner;
public class Tugas01FinalH071191056{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        System.out.println("Masukkan Berapa banyak data: ");
        int data = raf.nextInt();
        int banyakData[] = new int[data];

        int jumlahData = 0;
        //For yang ini digunakan untuk meng-input angka-angka sesuai dengan jumlah inputan sebelumnya
        for(int i = 0; i < data; i++){
            banyakData[i] = raf.nextInt();
            jumlahData += banyakData[i];
        }
        //rumus untuk menghitung atau mencari rata-rata 
        double rata2 = Double.valueOf(jumlahData) / data;
        //System.out.println(rata2);
        double hasilError = 0;
        System.out.println("-------------------------------------------------");
        System.out.println("|\tNo\t|\tdata\t|\terror\t|");
        System.out.println("-------------------------------------------------");
        //For yang ke-2 ini digunakan untuk:
        //1. Menghitung Nilai pada error sesuai rumus yang diberikan
        //2. Menampilkan data pada nomor ke berapa
        //3. Menampilkan macam-macam data yang di masukkan
        for(int i = 0; i < data; i++){
            hasilError = Math.pow(Math.pow(rata2 - banyakData[i],2 ), 0.5);
            //System.out.println(hasilError);
            System.out.println("|\t" + (i + 1)  + "\t|\t " + banyakData[i] + "\t|\t" + hasilError + " \t|\t");
        }
        System.out.println("-------------------------------------------------");

    }
}