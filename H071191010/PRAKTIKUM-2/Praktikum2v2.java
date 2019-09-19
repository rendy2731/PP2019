import java.util.Scanner;    
    public class Praktikum2v2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Waktu mulainya acara ");
            int hh1 = sc.nextInt();
            int mm1 = sc.nextInt();
            System.out.print("Waktu berakhirnya acara ");
            int hh2 = sc.nextInt();
            int mm2 = sc.nextInt();
            int jam = 0;
            int menit = 0;

            if (hh1 > hh2) {
                if (mm1 > mm2){
                    jam = 23-(hh1-hh2);
                    menit = 60-(mm1-mm2);
                }
                else if (mm1 == mm2){
                    jam = 24 - (hh1-hh2);
                    menit = 0;
                }
                else if (mm1 < mm2){
                    jam = 24 - (hh1-hh2);
                    menit = mm2-mm1;

                }
            }
            if (hh1 == hh2) {
                if (mm1 > mm2){
                    jam = 23;
                    menit = 60-(mm1-mm2);
                }
                else if (mm1 == mm2){
                    jam = 24;
                    menit = 0;
                    System.out.println("satu hari");
                }
                else if (mm1 < mm2){
                    jam = 24;
                    menit = mm2-mm1;
                    System.out.println("lebih dari satu hari");
                }
            }
            if (hh1 < hh2) {
                if (mm1 > mm2){
                    jam = (hh2-hh1)-1;
                    menit = 60-(mm1-mm2);
                }
                else if (mm1 == mm2) {
                    jam = hh2-hh1;
                    menit = 0;
                }
                else if (mm1 < mm2) {
                    jam = hh2-hh1;
                    menit = mm2-mm1;
                }
            }
           
            System.out.println(jam +" : "+ menit);
           

    }
}