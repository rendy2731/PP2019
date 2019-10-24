import java.util.Scanner;
import java.util.Random;

public class P5_2 {

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        int n = sep.nextInt();
        int m = sep.nextInt();
        String serialNumber = generateSerial (n,m);
        System.out.println(serialNumber);  
    }
    public static String generateSerial (int n,int m){
        Random angka = new Random();
        String septi = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                septi += (char)(angka.nextInt(10)+ '0');
            }
            if (i<n-1){
                septi += '-';
            }
        }
        return septi;
    }
}
