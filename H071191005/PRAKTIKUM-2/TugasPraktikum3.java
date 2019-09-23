import java.util.Scanner;

public class TugasPraktikum3{
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.print("Input angka sesuai dengan menu yang diinginkan : ");
        int input1 = cd.nextInt();
        if (input1 == 1){
            System.out.println("** Pilih Bangun Datar **\n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n8. Layang - Layang");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
            int input2 = cd.nextInt();
            if(input2 == 1){
                System.out.println("Input Sisi : ");
                int panjang = cd.nextInt();
                double persegi = Math.pow(panjang, 2);
                System.out.println("Luas Persegi : "+persegi);
            }if(input2 == 2){
                System.out.println("Input Panjang : ");
                int panjang = cd.nextInt();
                System.out.println("Input Lebar : ");
                int lebar = cd.nextInt();
                double persegiPanjang = panjang * lebar;
                System.out.println("Luas Persegi Panjang : "+persegiPanjang);
            }if(input2 == 3){
                System.out.println("Input Alas : ");
                int panjang = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int lebar = cd.nextInt();
                double segitiga = (panjang * lebar)/2;
                System.out.println("Luas Segitiga : "+segitiga);
            }if(input2 == 4){
                System.out.println("Input Jari - Jari : ");
                int panjang = cd.nextInt();
                double lingkaran = Math.PI*Math.pow(panjang, 2);
                System.out.printf("Luas Lingkaran : %.2f\n",lingkaran);
            }if(input2 == 5){
                System.out.println("Input Alas : ");
                int panjang = cd.nextInt();
                System.out.println("Input Tinggi");
                int lebar = cd.nextInt();
                double jajarGenjang = panjang * lebar;
                System.out.println("Luas Jajar Genjang"+jajarGenjang);
            }if(input2 == 6){
                System.out.println("Input Sisi 1 :");
                int panjang = cd.nextInt();
                System.out.println("Input Sisi 2 :");
                int lebar = cd.nextInt();
                System.out.println("Input Tinggi");
                int tinggi = cd.nextInt();
                double trapesium = ((panjang + lebar)*tinggi)/(float)2;
                System.out.println("Luas Trapesium : "+trapesium);
            }if(input2 == 7){
                System.out.println("Input Diagonal 1 : ");
                int panjang = cd.nextInt();
                System.out.println("Input Diagonal 2 : ");
                int lebar = cd.nextInt();
                double belahKetupat = (panjang * lebar)/2;
                System.out.println("Luas Belah Ketupat : "+belahKetupat);
            }if(input2 == 8){
                System.out.println("Input Diagonal 1 : ");
                int panjang = cd.nextInt();
                System.out.println("Input Diagonal 2 : ");
                int lebar = cd.nextInt();
                double layangLayang = (panjang * lebar)/2;
                System.out.println("Luas Layang - Layang : "+layangLayang);
            }
        }else if(input1 == 2){
            System.out.println("** Pilih Bangun Ruang **\n1. Kubus\n2. Balok\n3. Prisma Segitiga\n4. Limas Segiempat\n5. Limas Segitiga\n6. Tabung\n7. Kerucut\n8. Bola");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
            int input3 = cd.nextInt();
            if(input3 == 1){
                System.out.println("Input Rusuk : ");
                int panjang = cd.nextInt();
                double kubus = Math.pow(panjang, 3);
                System.out.println("Volume Kubus : "+kubus);
            }if(input3 == 2){
                System.out.println("Input Panjang : ");
                int panjang = cd.nextInt();
                System.out.println("Input Lebar : ");
                int lebar = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int tinggi = cd.nextInt();
                int balok = panjang*lebar*tinggi;
                System.out.println("Volume Balok : "+balok);
            }if(input3 == 3){
                System.out.println("Input Alas Segitiga : ");
                int panjang = cd.nextInt();
                System.out.println("Input Tinggi Segitiga : ");
                int lebar = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int tinggi = cd.nextInt();
                double prismaS = (panjang*lebar*tinggi)/2;
                System.out.printf("Volume Prisma Segitiga : %.2f\n",prismaS);
            }if(input3 == 4){
                System.out.println("Input Panjang Alas : ");
                int panjang = cd.nextInt();
                System.out.println("Input Lebar Alas : ");
                int lebar = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int tinggi = cd.nextInt();
                double limas4 = (panjang*lebar*tinggi)/(float)3;
                System.out.printf("Volume Limas Segiempat : %.2f\n",limas4);
            }if(input3 == 5){
                System.out.println("Input Alas Segitiga : ");
                int panjang = cd.nextInt();
                System.out.println("Input Tinggi Segitiga : ");
                int lebar = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int tinggi = cd.nextInt();
                double limas3 = (((panjang*lebar)/2)*tinggi)/(float)3;
                System.out.printf("Volume Limas Segitiga : %.2f\n",limas3);
            }if(input3 == 6){
                System.out.println("Input Jari - Jari : ");
                int panjang = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int tinggi = cd.nextInt();
                double tabung = Math.PI*Math.pow(panjang, 2)*tinggi;
                System.out.printf("Volume Tabung : %.2f\n",tabung);
            }if(input3 == 7){
                System.out.println("Input Jari - Jari : ");
                int panjang = cd.nextInt();
                System.out.println("Input Tinggi : ");
                int lebar = cd.nextInt();
                double kerucut = ((Math.PI*Math.pow(panjang, 2))*lebar)/(float)3;
                System.out.printf("Volume Kerucut : %.2f\n",kerucut);
            }if(input3 == 8){
                System.out.println("Input Jari - Jari : ");
                int panjang = cd.nextInt();
                double bola = 4*(Math.PI * Math.pow(panjang, 3))/3;
                System.out.printf("Volume Bola : %.2f",bola);
            }
        }
    }
}