import java.util.Scanner;
public class Praktikum6v2{
  public static void main(String[] args) {
    Scanner af = new Scanner(System.in);
    String kalimat = af.nextLine();

    //  System.out.println(kalimatToChar.length);
    int matrix[][] = new int[4][4];
    char[] kalimatToChar = kalimat.toCharArray();
    //String kalimat2 = String.valueOf(matrix);
    //String kalimatToString = new String(kalimatToChar);
    //int kalimatToInt = Integer.valueOf(kalimatToString);
    String kata = "";

    for(int i = 0; i < kalimatToChar.length; i ++){
      if(i % 2 != 0){
         int charToInt = (int) kalimatToChar[i];
         kata += charToInt;
      }
      else{
        kata += kalimatToChar[i];
      }
    }
    //System.out.println(kataGanjil);
    char[] kataToChar = kata.toCharArray();
    int jumlahKata = (int) Math.ceil(kataToChar.length / 16.0);
    int banyakSpasi = 0;
    //int jumlahKataToInt = (int) jumlahKata;
    //System.out.println(kata);
    for(int i = 0; i < jumlahKata * 16; i++){
      if (i < kataToChar.length)
        System.out.print(kataToChar[i]);
      else
        System.out.print('?');
      if((i+1) % jumlahKata == 0){
        if(banyakSpasi >= 3){
          System.out.println();
          banyakSpasi = 0;
        }
        else{
          System.out.print(" ");
          banyakSpasi++;
        }
        //System.out.print(" ");
      }
    }

    //String kata2 = "";
    /*
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix.length; j++){
        //System.out.println(kataToChar[i]);
        kata2 += kataToChar[i];
      }
    }
    System.out.println(kata3);
    //System.out.println();
    */
  }
}