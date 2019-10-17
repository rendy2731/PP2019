import java.util.Scanner;
public class MethodRPL01{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);

    System.out.print("Masukkan Nilai Pertama: ");
    int firstValue = raf.nextInt();

    System.out.println("Masukkan Nilai Kedua: ");
    int secondValue = raf.nextInt();

    System.out.println("FPB dari " + firstValue + " dan " + secondValue + " = " + nilaiFPB(firstValue,secondValue));
  }
  static int nilaiFPB(int nilai1, int nilai2){
      int nilai3 = 0;
      int nilaiMax = Math.max(nilai1, nilai2);
      int i = nilaiMax;
      while(i > 0){
        i--;
        if(nilai1 % i == 0 && nilai2 % i == 0){
          nilai3 += i;
          break;
        }
    }
    return nilai3;
  }
}
