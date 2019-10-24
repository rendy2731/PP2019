import java.util.Scanner;

public class P5_3{
    public static void main (String[] args){
     Scanner sep = new Scanner (System.in);
     int usia = sep.nextInt();

     tahun(usia);
     bulan(usia);
     hari(usia);

     System.out.println(tahun (usia) + " tahun ");
     System.out.println(bulan (usia)+ " bulan " );
     System.out.println(hari (usia) + " hari " );

    }
    static int tahun(int usia){
        int tahun = usia/365;
        return tahun;
    } 
    static int bulan (int usia){
        int bulan = (usia%365)/30;
        return bulan;
    }
    static int hari (int usia){
        int hari = (usia%365)%30;
        return hari;
    }
}
