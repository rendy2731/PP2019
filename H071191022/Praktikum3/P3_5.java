import java.util.Scanner;

public class P3_5 {

    public static void main(String[] args) {
        Scanner lab = new Scanner (System.in);
        float derajat = 0;
        int jam = 0;
        int menit = 0;
        int detik = 0;

        //1 derajat = 3600 detik dalam jam * 24 jam dalam sehari/360 derajat dalam satu hari = 240

        System.out.println("masukkan waktu");
        while (lab.hasNextFloat()){
            float time = lab.nextFloat();

            if(time >= 0 && time < 360){  
                derajat = time * 240;
                int x = (int)derajat;
                jam = (x/3600) + 6;
            
                //untuk jam
            if (jam > 23){
                jam -= 24;
    
            }else{
                jam += 0;
            }
                menit = (x%3600)/60;
                detik = (x%3600)%60;


            if (x >= 0 && x<14400){
                System.out.println("selamat pagi");

            }else if (x>= 14400 && x<32400){
                System.out.println("selamat siang");

            }else if (x>= 32400 && x < 46800){
                System.out.println("selamat sore");

            }else if (x>= 46800 && x< 79200){
                System.out.println("selamat malam");

            }else{
                System.out.println("subuh");
            }
          }else{
              System.out.println("tidak valid");
          }
          System.out.printf("%02d:%02d:%02d \n", jam,menit,detik);
        }
    }
}