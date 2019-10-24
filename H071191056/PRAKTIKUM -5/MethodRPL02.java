import java.util.*;
public class MethodRPL02{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);
    int n = raf.nextInt();
    int m = raf.nextInt();
    String serialNumber = generateSerial(n, m);
    System.out.println(serialNumber);

  }
  public static String generateSerial(int n,int m){
    String str = "";
    Random angka = new Random();

    for(int i = 1; i <= n; i++){
      for(int j = 1; j<= m; j++){
        int nilai = angka.nextInt(10);
        str += String.valueOf(nilai);

      }
      if(i == n){
        str += " ";
      }
      else{
        str += "-";
      }
    }
    return str;
  }
}
