import java.util.Scanner;

class Praktikum2 {

    public static void main(String[] args){
    Scanner praktikum2 = new Scanner (System.in);
    int jam,menit,detik;
    System.out.println(" input detik ");
    detik = praktikum2.nextInt();
    jam = detik/3600;
    detik = detik-(jam*3600);
    menit = detik/60;
    detik = detik-(menit*60);
    System.out.printf("%d:%d:%d" ,jam,menit,detik);

    }


    

}


