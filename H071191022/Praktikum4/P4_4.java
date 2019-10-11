import java.util.Scanner;
public class P4_4 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        System.out.println("masukkan banyak elemen");
        int n = lab.nextInt();
        System.out.println("masukkan elemen");
        int banyakElemen [] = new int [n];
        
        for (int i = 0; i < banyakElemen.length; i++) {
            banyakElemen[i] = lab.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                int hasil1 = banyakElemen[i];
                int hasil2 = banyakElemen[j];

                while (hasil1 != hasil2){
                    if (hasil1>hasil2){
                        hasil1 = hasil1 - hasil2;
                    }else{
                        hasil2 = hasil2-hasil1;
                    }
                }
                if (hasil1==1){
                    System.out.println(banyakElemen[i] + " " + banyakElemen[j]);
                }
            }
        }
    }
}