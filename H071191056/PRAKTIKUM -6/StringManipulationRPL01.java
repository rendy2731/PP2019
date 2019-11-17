import java.util.Scanner;
public class StringManipulationRPL01{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);
    System.out.println("Masukkan Kalimat: ");
    String kalimat = raf.nextLine();
    String hurufBesar = kalimat.toUpperCase();
    String tanpaSpasi = hurufBesar.replaceAll(" ", "");
    int bagiKalimat = tanpaSpasi.length() / 2;
    String setengahKalimat = tanpaSpasi.substring(0, bagiKalimat);
    char[] indeksSetengahKalimat = setengahKalimat.toCharArray();
    int jumlahKalimat = kalimat.length() * kalimat.length();
    String cetakKalimat = "";

    for(int i = indeksSetengahKalimat.length - 2; i >= 0; i--){
        cetakKalimat += indeksSetengahKalimat[i];
    }
      String hexa = String.format("#%x",jumlahKalimat);
      System.out.printf(hexa);
      char a[] = hexa.toCharArray();
      System.out.print(setengahKalimat);
      System.out.print(cetakKalimat);
      System.out.printf("%o",kalimat.length());
      int alphabet = 0;
      for(int i = 0; i < a.length; i++)
      {
        if(a[i] >= 'A' && a[i] <= 'z')
        {
          alphabet++;
          break;
        }
      }
      System.out.printf("%c",alphabet == 1 ? '?':'!');
  }
}
