import java.util.Scanner;
public class MethodRPL03{
  public static void main(String[] args) {
      Scanner raf = new Scanner(System.in);
      System.out.println("Masukkan Usia: ");
      int usia = raf.nextInt();
      myDay(usia);
  }
  public static void myDay(int usia){
    int tahun = usia / 365;
    System.out.println(tahun + " tahun");
    int bulan = (usia % 365) / 30;
    System.out.println(bulan + " bulan");
    int hari = (usia % 365) % 30;
    System.out.println(hari + " hari");

  }
  /*
  public static void tahun(int usiaTahun){
    int tahun = usiaTahun / 365;
    System.out.println(tahun + " tahun");
  }
  public static void bulan(int usiaBulan){
    int bulan = (usiaBulan % 365) / 30;
    System.out.println(bulan + " bulan ");
  }
  public static void hari(int usiaHari){
    int hari = (usiaHari % 365) % 30;
    System.out.println(hari + " hari");
  }*/
}
