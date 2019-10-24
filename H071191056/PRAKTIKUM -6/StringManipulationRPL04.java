import java.util.Scanner;
public class StringManipulationRPL04{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);
    System.out.println("Masukkan Input String: ");
    String nama = raf.next();
    char[] nameOfIndex = nama.toCharArray();
    int tambah = raf.nextInt();
    for(int i = 0; i < nameOfIndex.length; i++){
      if(nameOfIndex[i] + tambah <= 'Z' || nameOfIndex[i] <= 'z'){
        //nameOfIndex[i] += tambah;
         nameOfIndex[i] += tambah;
         System.out.print(nameOfIndex[i]);
      }
    }
  }
}
