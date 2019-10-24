import java.util.Scanner;
public class MethodRPL04{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);
    System.out.println("** Menu **");
    System.out.println("1. Mencari Luas Bangun Datar");
    System.out.println("2. Mencari Volume Bangun Ruang");

    System.out.println("Input angka sesuai menu yang diinginkan : ");
    int angka = raf.nextInt();
    int bangunDatar;

    if(angka == 1){
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang ");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");

            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
            bangunDatar = raf.nextInt();

                 switch(bangunDatar){

                        //PERSEGI
                        case 1:
                        System.out.println("Input sisi persegi: ");
                        int sisi = raf.nextInt();
                        luasPersegi(sisi);

                        break;

                        //PERSEGI PANJANG
                        case 2:
                        System.out.println("Input Panjang Persegi Panjang: ");
                        int panjang = raf.nextInt();
                        System.out.println("Input Lebar Persegi Panjang: ");
                        int lebar = raf.nextInt();
                        luasPersegiPanjang(panjang,lebar);

                        break;

                        //SEGITIGA
                        case 3:
                        System.out.println("Input Alas: ");
                        int alas = raf.nextInt();
                        System.out.println("Input Tinggi: ");
                        int tinggi = raf.nextInt();
                        luasSegitiga(alas,tinggi);

                        break;

                        //LINGKARAN
                        case 4:
                        System.out.println("Input Pii: ");
                        double pii = Math.PI;
                        System.out.println("Input Jari-jari:  ");
                        int jari2 = raf.nextInt();
                        luasLingkaran(pii,jari2);

                        break;

                        //JAJAR GENJANG
                        case 5:
                        System.out.println("Input Alas: ");
                        int alas2 = raf.nextInt();
                        System.out.println("Input Tinggi: ");
                        int tinggi2 = raf.nextInt();
                        luasJajarGenjang(alas2,tinggi2);

                        break;

                        //TRAPESIUM
                        case 6:
                        System.out.println("Input Panjang Sisi Sejajar: ");
                        int panjangSisi = raf.nextInt();
                        System.out.println("Input Tinggi: ");
                        int tinggi3 = raf.nextInt();
                        luasTrapesium(panjangSisi,tinggi3);

                        break;

                        //BELAHKETUPAT
                        case 7:
                        System.out.println("Input Alas: ");
                        int alas4 = raf.nextInt();
                        System.out.println("Input Tinggi: ");
                        int tinggi4 = raf.nextInt();
                        luasBelahKetupat(alas4,tinggi4);

                        break;

                        //LAYANG-LAYANG
                        case 8:
                        System.out.println("Input Diagonal1: ");
                        int diagonal1 = raf.nextInt();
                        System.out.println("Input Diagonal2: ");
                        int diagonal2 = raf.nextInt();
                        luasLayang2(diagonal1,diagonal2);

                        break;

                        default:
                        System.out.println("Pilihan Tidak Tersedia Bos");

                    }
        }

  }
  public static void luasPersegi(int sisi){
    sisi *= sisi;
    System.out.println("Luas Persegi = " + sisi);
  }
  public static void luasPersegiPanjang(int panjang, int lebar){
    double luasPersegiPanjang = Double.valueOf(panjang * lebar);
    System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
  }
  public static void luasSegitiga(int alas, int tinggi){
    double luasSegitiga = Double.valueOf(alas * tinggi) / 2;
    System.out.println("Luas Segitiga = " + luasSegitiga);
  }
  public static void luasLingkaran(double pii, int jari2){
    double luasLingkaran = pii * Math.pow(jari2,2);
    System.out.println("Luas Lingkaran = " + luasLingkaran);
  }
  public static void luasJajarGenjang(int alas2, int tinggi2){
    Double.valueOf(alas2 *= tinggi2);
    System.out.println("Luas Jajar Genjang = " + alas2);
  }
  public static void luasTrapesium(int panjangSisi, int tinggi3){
    double luasTrapesium = (panjangSisi * tinggi3) / 2;
    System.out.println("Luas Trapesium = " + luasTrapesium);
  }
  public static void luasBelahKetupat(int alas4, int tinggi4) {
    Double.valueOf(alas4 *= tinggi4);
    System.out.println("Luas Belah Ketupat = " + alas4);
  }
  public static void luasLayang2(int diagonal1, int diagonal2){
    double luasLayang2 = (diagonal1 * diagonal2) / 2;
    System.out.println("Luas Layang-layang = " + luasLayang2);
  }
}
