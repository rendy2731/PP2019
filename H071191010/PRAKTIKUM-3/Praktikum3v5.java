import java.util.Scanner;

class Praktikum3v5{
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        float n = af.nextInt();
        int hari = 86400;
        int detik = (int) ((n * hari)/360);
        int jam = 6;
        int menit = 0;

        while (detik >= 3600) {
            detik -= 3600;
            jam++;
        }
        while (detik >= 60){
            detik -= 60;
            menit++;
        }
        jam%=24;
        
        if (jam >= 5 && jam < 12){
            System.out.println("Selamat Pagi");
        }else if (jam >= 12 && jam <= 14){
            System.out.println("Selamat Siang");
        }else if (jam >= 15 && jam <= 18){
            System.out.println("Selamat Sore");
        }else {
            System.out.println("Selamat malam");
        }
        System.out.printf("%02d : %02d : %02d\n", jam, menit, detik);
    }
}